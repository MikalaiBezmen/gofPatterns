package behavioralDesignPatterns.iterator.src.impl;

import behavioralDesignPatterns.iterator.src.api.ChannelCollection;
import behavioralDesignPatterns.iterator.src.api.ChannelIterator;
import behavioralDesignPatterns.iterator.src.api.ChannelTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * ChannelCollectionImpl.
 * Date: 01/07/2018
 *
 * @author Mikalai Bezmen
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        this.channelsList.add(channel);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

    // Iterator implementation should be inner class.
    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;

        private ChannelIteratorImpl(ChannelTypeEnum channelType, List<Channel> channelsList) {
            this.type = channelType;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel channel = channels.get(position);
                if (channel.getType().equals(type) ||
                        type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }
}
