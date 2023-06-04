package com.fatecapi.moneymind.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fatecapi.moneymind.entity.Log;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LogService {
    private static final String LOGS_DIRECTORY = "logs";
    private static final String LOG_FILE_EXTENSION = ".json";

    private final ObjectMapper objectMapper;

    public LogService() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        this.objectMapper.registerModule(new JavaTimeModule());
    }

    public void log(String requestType, String url, String message) {
        Date currentDateTime = new Date();
        String fileName = "Log" + new SimpleDateFormat("yyyy-MM-dd").format(currentDateTime) + LOG_FILE_EXTENSION;
        String filePath = LOGS_DIRECTORY + File.separator + fileName;

        Log logEntry = new Log();
        logEntry.setRequestType(requestType);
        logEntry.setUrl(url);
        logEntry.setDateTime(currentDateTime);
        logEntry.setMessage(message);

        try {
            List<Log> logList = new ArrayList<>();

            File logFile = new File(filePath);
            if (logFile.exists()) {
                String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
                logList = objectMapper.readValue(fileContent, new TypeReference<List<Log>>() {});
            } else {
                logFile.getParentFile().mkdirs();
                logFile.createNewFile();
            }

            logList.add(logEntry);
            objectMapper.writeValue(logFile, logList);
        } catch (IOException e) {
            e.printStackTrace();
            // Tratar exceção de IO
        }
    }
}
