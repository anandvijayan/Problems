package com.sabre.intvw.test;

import com.sabre.intvw.WordCount;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;

public class WordCountTest {
    @org.junit.Test
    public void countWords() throws Exception {
        String str="This was my first time. 6:35 AM in the morning. I was awake because of the jetlag, standing in this small hotel room in my PJs and it happened. "
                + "The hotel moved. As if it were a paper construction. The potential strength of that earthquake was palpable. "
                + "Like the touch of a giant who has decided not to hurt you but whose \"caress\" still sends you across the room."
                + "I check the net and the monitoring of earthquakes and sure enough, I find it: a 5.3 magnitude quake off the coast of Japan. "
                + "Nothing really but enough to make me think that I don't want to die here, that I want to be back home as quickly as possible, surrounded by friends and familiar faces. "
                + "I've checked. There has been no earthquake recorded in Washington DC for the past 100 years. ~";
        assertEquals(2,new WordCount().countWords(new BufferedReader(new StringReader(str)),"hotel"));
    }

}