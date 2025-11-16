package com.avva.three.collectioninject;

import com.avva.three.nesting.Song;
import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
class CollectingBean {

    @Autowired
    @Qualifier("list")
    //@Resource(name = "list")
    //@Value("#{collectionConfig.list}")
    //@Inject @Named("list")
    List<Song> songListResource;

    //@Autowired //@Qualifier("list")
    //@Inject @Named("list")
    @Resource(name = "list")
    //@Value("#{collectionConfig.list}")
    List<Song> songList;

    @Autowired
    Set<Song> songSet;

    @Autowired
    @Qualifier("set")
    @Resource(name="set")
    Set<Song> songSetResource;

    @Autowired
    Map<String, Song> songMap;

    @Autowired @Qualifier("map")
    //@Resource(name = "map")
    Map<String, Song> songMapResource;

    @Autowired
    Properties props;

    public void printCollections() {
        System.out.println(" -- list injected using @Autowired --");
        songList.forEach(s -> System.out.println(s.getTitle()));

        System.out.println(" -- list injected using @Resource / @Autowired @Qualifier(\"list\") / @Inject @Named(\"list\") -- ");
        songListResource.forEach(s -> System.out.println(s.getTitle()));

        System.out.println(" -- set injected using @Autowired -- -- ");
        songSet.forEach(s -> System.out.println(s.getTitle()));

        System.out.println(" -- set injected using @Resource / @Autowired @Qualifier(\"set\") / @Inject @Named(\"set\") -- ");
        songSetResource.forEach(s -> System.out.println(s.getTitle()));

        System.out.println(" -- map injected using  @Autowired -- ");
        songMap.forEach((k,v) -> System.out.println(k + ": " + v.getTitle()));

        System.out.println(" -- map injected using @Resource / @Autowired @Qualifier(\"map\") / @Inject @Named(\"map\")-- ");
        songMapResource.forEach((k,v) -> System.out.println(k + ": " + v.getTitle()));

        System.out.println(" -- props injected with @Autowired -- ");
        props.forEach((k,v) -> System.out.println(k + ": " + v));
    }


}
