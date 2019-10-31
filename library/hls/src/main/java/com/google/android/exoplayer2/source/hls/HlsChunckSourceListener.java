package com.google.android.exoplayer2.source.hls;

import android.net.Uri;

import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;

import java.util.List;

public interface HlsChunckSourceListener {

    void loadChunk(HlsPlaylistTracker tracker, Uri[] urls, int currentStream , HlsMediaPlaylist.Segment currentSegment, long currentTime, long loadedTime);
}
