package com.gmail.skywitty92.netty.echo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class EchoServerHandler extends ChannelInboundHandlerAdapter {
	
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) { 
    	ctx.write(msg);
    	// ctx.write(Object) ��������ʹ��Ϣд�뵽ͨ���ϣ��������������ڲ�������Ҫ���� ctx.flush() �������ѻ�����������ǿ�������
    	// ����������ø����� cxt.writeAndFlush(msg) �Դﵽͬ����Ŀ�ġ�
    	System.out.println(((ByteBuf) msg).toString(io.netty.util.CharsetUtil.UTF_8));
    	ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { 
        // �������쳣�͹ر�����
        cause.printStackTrace();
        ctx.close();
    }
}
