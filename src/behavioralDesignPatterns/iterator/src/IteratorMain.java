package behavioralDesignPatterns.iterator.src;

import behavioralDesignPatterns.iterator.src.api.ChannelCollection;
import behavioralDesignPatterns.iterator.src.api.ChannelIterator;
import behavioralDesignPatterns.iterator.src.api.ChannelTypeEnum;
import behavioralDesignPatterns.iterator.src.impl.Channel;
import behavioralDesignPatterns.iterator.src.impl.ChannelCollectionImpl;

/**
 * IteratorMain.
 * Date: 01/02/2018
 *
 * @author Mikalai Bezmen
 */
public class IteratorMain {

    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator =
                channels.iterator(ChannelTypeEnum.ALL);
        while (baseIterator.hasNext()) {
            Channel channel = baseIterator.next();
            System.out.println(channel.toString());
        }
        System.out.println("******");
        // Channel Type Iterator
        ChannelIterator englishIterator =
                channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}
