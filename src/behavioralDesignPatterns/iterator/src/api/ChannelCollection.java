package behavioralDesignPatterns.iterator.src.api;

import behavioralDesignPatterns.iterator.src.impl.Channel;

/**
 * ChannelCollection.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public interface ChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel c);

    ChannelIterator iterator(ChannelTypeEnum type);
}
