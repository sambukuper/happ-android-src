.class public final Lct3;
.super Lg92;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic f0:B

.field public final g0:Ljava/io/Closeable;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Closeable;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lct3;->f0:B

    .line 2
    .line 3
    invoke-direct {p0}, Lg92;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final declared-synchronized g()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lct3;->f0:B

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 8
    .line 9
    check-cast v0, Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0

    .line 19
    :pswitch_0
    :try_start_2
    iget-object v0, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 20
    .line 21
    check-cast v0, Ljava/io/RandomAccessFile;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 30
    throw v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final declared-synchronized k(J[BII)I
    .locals 3

    .line 1
    iget-byte v0, p0, Lct3;->f0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    monitor-enter p0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 13
    .line 14
    check-cast v0, Ljava/nio/channels/FileChannel;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 17
    .line 18
    .line 19
    invoke-static {p3, p4, p5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    if-ge v1, p5, :cond_1

    .line 24
    .line 25
    iget-object p2, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 26
    .line 27
    check-cast p2, Ljava/nio/channels/FileChannel;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 30
    .line 31
    .line 32
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    if-ne p2, v2, :cond_0

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    monitor-exit p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/2addr v1, p2

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    monitor-exit p0

    .line 44
    move v2, v1

    .line 45
    :goto_1
    return v2

    .line 46
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1

    .line 48
    :pswitch_0
    :try_start_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 52
    .line 53
    check-cast v0, Ljava/io/RandomAccessFile;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 56
    .line 57
    .line 58
    :goto_3
    if-ge v1, p5, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 61
    .line 62
    check-cast p1, Ljava/io/RandomAccessFile;

    .line 63
    .line 64
    sub-int p2, p5, v1

    .line 65
    .line 66
    invoke-virtual {p1, p3, p4, p2}, Ljava/io/RandomAccessFile;->read([BII)I

    .line 67
    .line 68
    .line 69
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    if-ne p1, v2, :cond_2

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    monitor-exit p0

    .line 75
    goto :goto_4

    .line 76
    :cond_2
    add-int/2addr v1, p1

    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    goto :goto_5

    .line 80
    :cond_3
    monitor-exit p0

    .line 81
    move v2, v1

    .line 82
    :goto_4
    return v2

    .line 83
    :goto_5
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    throw p1

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final declared-synchronized m()J
    .locals 2

    .line 1
    iget-byte v0, p0, Lct3;->f0:B

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 8
    .line 9
    check-cast v0, Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return-wide v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0

    .line 20
    :pswitch_0
    :try_start_2
    iget-object v0, p0, Lct3;->g0:Ljava/io/Closeable;

    .line 21
    .line 22
    check-cast v0, Ljava/io/RandomAccessFile;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    monitor-exit p0

    .line 29
    return-wide v0

    .line 30
    :catchall_1
    move-exception v0

    .line 31
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 32
    throw v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
