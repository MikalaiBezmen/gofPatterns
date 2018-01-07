package behavioralDesignPatterns.iterator.src.api;

import behavioralDesignPatterns.iterator.src.impl.Channel;

/**
 * ChannelIterator.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public interface ChannelIterator {

    boolean hasNext();

    Channel next();
}
