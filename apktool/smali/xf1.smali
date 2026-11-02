.class public final Lxf1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lje7;


# instance fields
.field public final X:Ljava/io/InputStream;

.field public final Y:Lae7;

.field public final synthetic Z:Lz47;


# direct methods
.method public constructor <init>(Lz47;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxf1;->Z:Lz47;

    .line 5
    .line 6
    iget-object p1, p1, Lz47;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/net/Socket;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lxf1;->X:Ljava/io/InputStream;

    .line 15
    .line 16
    new-instance v0, Lae7;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lae7;-><init>(Ljava/net/Socket;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lxf1;->Y:Lae7;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxf1;->Z:Lz47;

    .line 2
    .line 3
    iget-object v1, p0, Lxf1;->Y:Lae7;

    .line 4
    .line 5
    invoke-virtual {v1}, Lnv;->enter()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, v0, Lz47;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    iget-object v0, v0, Lz47;->Y:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/net/Socket;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    and-int/lit8 v4, v3, 0x2

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    or-int/lit8 v4, v3, 0x2

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    move v2, v4

    .line 38
    :goto_0
    if-eqz v2, :cond_6

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    if-eq v2, v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    .line 50
    .line 51
    .line 52
    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_5

    .line 62
    :catch_0
    move-exception p0

    .line 63
    goto :goto_3

    .line 64
    :catch_1
    :try_start_2
    iget-object p0, p0, Lxf1;->X:Ljava/io/InputStream;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lnv;->exit()Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :try_start_3
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-virtual {v1}, Lnv;->exit()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_5

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    const/4 p0, 0x0

    .line 85
    invoke-virtual {v1, p0}, Lnv;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    throw p0

    .line 90
    :cond_6
    invoke-virtual {v1}, Lnv;->exit()Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :goto_3
    :try_start_4
    invoke-virtual {v1}, Lnv;->exit()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_7

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-virtual {v1, p0}, Lnv;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_5
    invoke-virtual {v1}, Lnv;->exit()Z

    .line 107
    .line 108
    .line 109
    throw p0
.end method

.method public final read(Li90;J)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p2, v0

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    if-ltz v2, :cond_6

    .line 12
    .line 13
    iget-object v0, p0, Lxf1;->Y:Lae7;

    .line 14
    .line 15
    invoke-virtual {v0}, Lta8;->throwIfReached()V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {p1, v1}, Li90;->u0(I)Lmz6;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget v2, v1, Lmz6;->c:I

    .line 24
    .line 25
    rsub-int v2, v2, 0x2000

    .line 26
    .line 27
    int-to-long v2, v2

    .line 28
    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide p2

    .line 32
    long-to-int p2, p2

    .line 33
    :try_start_0
    invoke-virtual {v0}, Lnv;->enter()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1

    .line 34
    .line 35
    .line 36
    :try_start_1
    iget-object p0, p0, Lxf1;->X:Ljava/io/InputStream;

    .line 37
    .line 38
    iget-object p3, v1, Lmz6;->a:[B

    .line 39
    .line 40
    iget v2, v1, Lmz6;->c:I

    .line 41
    .line 42
    invoke-virtual {p0, p3, v2, p2}, Ljava/io/InputStream;->read([BII)I

    .line 43
    .line 44
    .line 45
    move-result p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :try_start_2
    invoke-virtual {v0}, Lnv;->exit()Z

    .line 47
    .line 48
    .line 49
    move-result p2
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_1

    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    const/4 p2, -0x1

    .line 53
    if-ne p0, p2, :cond_2

    .line 54
    .line 55
    iget p0, v1, Lmz6;->b:I

    .line 56
    .line 57
    iget p2, v1, Lmz6;->c:I

    .line 58
    .line 59
    if-ne p0, p2, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Lmz6;->a()Lmz6;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iput-object p0, p1, Li90;->X:Lmz6;

    .line 66
    .line 67
    invoke-static {v1}, Lpz6;->a(Lmz6;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    const-wide/16 p0, -0x1

    .line 71
    .line 72
    return-wide p0

    .line 73
    :cond_2
    iget p2, v1, Lmz6;->c:I

    .line 74
    .line 75
    add-int/2addr p2, p0

    .line 76
    iput p2, v1, Lmz6;->c:I

    .line 77
    .line 78
    iget-wide p2, p1, Li90;->Y:J

    .line 79
    .line 80
    int-to-long v0, p0

    .line 81
    add-long/2addr p2, v0

    .line 82
    iput-wide p2, p1, Li90;->Y:J

    .line 83
    .line 84
    return-wide v0

    .line 85
    :cond_3
    const/4 p0, 0x0

    .line 86
    :try_start_3
    invoke-virtual {v0, p0}, Lnv;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    throw p0
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_1

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_1

    .line 93
    :catch_0
    move-exception p0

    .line 94
    :try_start_4
    invoke-virtual {v0}, Lnv;->exit()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {v0, p0}, Lnv;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_1
    :try_start_5
    invoke-virtual {v0}, Lnv;->exit()Z

    .line 107
    .line 108
    .line 109
    throw p0
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_1

    .line 110
    :catch_1
    move-exception p0

    .line 111
    invoke-static {p0}, Ly79;->a(Ljava/lang/AssertionError;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    new-instance p1, Ljava/io/IOException;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_5
    throw p0

    .line 124
    :cond_6
    const-string p0, "byteCount < 0: "

    .line 125
    .line 126
    invoke-static {p2, p3, p0}, Lie2;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lem7;->c(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-wide v0
.end method

.method public final timeout()Lta8;
    .locals 0

    .line 1
    iget-object p0, p0, Lxf1;->Y:Lae7;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "source("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxf1;->Z:Lz47;

    .line 9
    .line 10
    iget-object p0, p0, Lz47;->Y:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/net/Socket;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 p0, 0x29

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
