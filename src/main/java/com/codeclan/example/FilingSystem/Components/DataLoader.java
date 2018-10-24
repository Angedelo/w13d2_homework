package com.codeclan.example.FilingSystem.Components;

import com.codeclan.example.FilingSystem.models.File;
import com.codeclan.example.FilingSystem.models.Folder;
import com.codeclan.example.FilingSystem.models.User;
import com.codeclan.example.FilingSystem.repositories.FileRepository;
import com.codeclan.example.FilingSystem.repositories.FolderRepository;
import com.codeclan.example.FilingSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    @Override
    public void run(ApplicationArguments args){
        User matty = new User("Matty");
        userRepository.save(matty);
        User alice = new User("Alice");
        userRepository.save(alice);
        Folder games = new Folder("Games", matty);
        folderRepository.save(games);
        Folder work = new Folder("work", matty);
        folderRepository.save(work);
        Folder misc = new Folder("Misc", alice);
        File dishonoured = new File("Dishonoured", ".exe", 14, games);
        fileRepository.save(dishonoured);
        File cv = new File("cv", ".txt", 1, work);
        fileRepository.save(cv);
    }
}
