package com.milano.milano.domain.event;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String state, Boolean remomte, String eventUrl, MultipartFile image) {
    
}
