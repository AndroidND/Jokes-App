package com.example.jokesrus;


import java.util.Arrays;
import java.util.List;

public class JokesRUs {
    private  List<String> jokes = Arrays.asList(
            "An old man whose wife had recently\n" +
                    "passed away decided to place an obituary\n" +
                    "in the local paper. He went to see the editor and was told it would cost £1 a word.\n" +
                    "After turning out the contents of his pocket, the old man found £3 in loose change.\n" +
                    "He wrote: “Doris Smith Dead”.\n" +
                    "Seeing this, the editor felt so sorry for\n" +
                    "him he said; “For £3 you can have seven words.”\n" +
                    "The old man thanked him and thought\n" +
                    "for a while. Then he wrote: “Doris Smith\n" +
                    "Dead. Ford Focus for Sale”.",
            "A MAN WALKS INTO A BAR and orders a drink, \n" +
                    "then sits there looking at it for half an hour. \n" +
                    "Then a big trouble-making truck driver steps up \n" +
                    "next to the man, takes the drink from him and \n" +
                    "empties the glass. The poor man starts crying. \n" +
                    "The truck driver says, ‘Come on man, I was just \n" +
                    "joking. Here, I’ll buy you another drink. I just \n" +
                    "can’t stand seeing a man cry.’\n" +
                    "‘No, it’s not that. This is the worst day of my \n" +
                    "life. First, I fall asleep and I’m late to my office. \n" +
                    "My boss, in an outrage, fires me. When I leave \n" +
                    "the building to get my car, I find out it’s been \n" +
                    "stolen. The police say they can’t do anything. \n" +
                    "I get a cab home and after I get out, I remember \n" +
                    "I left my wallet and credit cards inside. The cab \n" +
                    "driver just drives away. Inside, I find my wife \n" +
                    "sleeping with the gardener. I leave home and \n" +
                    "come to this bar. And when I was thinking about \n" +
                    "putting an end to my life, you show up and drink \n" +
                    "my poison.’\n",
            "A beautiful woman approaches the bar in\n" +
                    "a quiet rural pub. She beckons alluringly to\n" +
                    "the barman, who immediately goes to serve\n" +
                    "her. She asks him to come closer, then\n" +
                    "leans over and seductively caresses his\n" +
                    "beard.\n" +
                    "“Are you the manager?” she asks, softly\n" +
                    "stroking his face with both hands.\n" +
                    "“Actually, no,” the man replies.\n" +
                    "“Then can you get him for me? I need to\n" +
                    "speak to him,” she says, running her hands\n" +
                    "through his beard.\n" +
                    "“I’m afraid I can’t,” says the barman\n" +
                    "breathlessly. “Is there anything I can do?”\n" +
                    "“Yes there is. I need you to give him a\n" +
                    "message,” she continues, running her finger through his hair.\n" +
                    "“What should I tell him?” the bartender\n" +
                    "just manages to say.\n" +
                    "“Tell him”, she whispers, now sliding\n" +
                    "two fingers inside his mouth, “that there is\n" +
                    "no toilet paper or hand soap in the ladies’\n" +
                    "room.”\n"
    );

    public  String getJoke() {
        int randomIndex = (int) Math.floor(jokes.size() * Math.random());
        return jokes.get(randomIndex);
    }
}

