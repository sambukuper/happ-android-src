.class public final Ll72;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Loh7;

.field public final c:Lh76;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj72;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Ll72;->a:Lvz7;

    .line 16
    .line 17
    sget-object v0, Le02;->X:Le02;

    .line 18
    .line 19
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ll72;->b:Loh7;

    .line 24
    .line 25
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Ll72;->c:Lh76;

    .line 30
    .line 31
    return-void
.end method

.method public static d(Ljava/io/InputStream;)Ljava/io/File;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 7
    .line 8
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "data.result.tmp"

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/io/FileOutputStream;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-static {p0, v1}, Lgv3;->m(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    .line 30
    .line 31
    .line 32
    new-instance p0, Ljava/io/File;

    .line 33
    .line 34
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {p0, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    invoke-static {v1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 2
    .line 3
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lh80;

    .line 12
    .line 13
    const/16 v2, 0x19

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lh80;-><init>(B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lkf4;->h(Lgn2;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "data.result"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "1792654306601"

    .line 36
    .line 37
    invoke-static {v1}, Lmm7;->c0(Ljava/lang/String;)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    sget-object v3, Lwe3;->a:Lmu0;

    .line 48
    .line 49
    invoke-interface {v3}, Lmu0;->a()Lte3;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Lte3;->a()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    sub-long/2addr v3, v1

    .line 58
    const-wide v1, 0x9a7ec800L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    cmp-long v1, v3, v1

    .line 64
    .line 65
    if-gez v1, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 v0, 0x0

    .line 69
    :goto_0
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ll72;->c(Ljava/io/InputStream;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Ldn8;->a:Ldn8;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_1
    const-string p0, "Required value was null."

    .line 82
    .line 83
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    instance-of v0, p0, Ljava/lang/InterruptedException;

    .line 91
    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    instance-of v0, p0, Ljava/util/concurrent/CancellationException;

    .line 95
    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    new-instance v0, Lrj6;

    .line 99
    .line 100
    invoke-direct {v0, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_2
    throw p0
.end method

.method public final b(Ljava/io/File;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ll72;->f()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/io/FileInputStream;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ll72;->c(Ljava/io/InputStream;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Ldn8;->a:Ldn8;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "Failed requirement."

    .line 32
    .line 33
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    new-instance p1, Lrj6;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_1
    throw p0
.end method

.method public final c(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 5

    .line 1
    :try_start_0
    invoke-static {p1}, Lgv3;->O(Ljava/io/InputStream;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-static {v0, v1}, Lx97;->a0(II)Lkf3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1, v0}, Leu;->F0([BLkf3;)[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v2, Ljava/lang/String;

    .line 17
    .line 18
    sget-object v3, Liq0;->a:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 21
    .line 22
    .line 23
    array-length v0, p1

    .line 24
    sub-int/2addr v0, v1

    .line 25
    array-length v4, p1

    .line 26
    invoke-static {v0, v4}, Lx97;->a0(II)Lkf3;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Leu;->F0([BLkf3;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v4, Ljava/lang/String;

    .line 35
    .line 36
    invoke-direct {v4, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    array-length v2, p1

    .line 44
    sub-int/2addr v2, v1

    .line 45
    invoke-static {v1, v2, p1}, Leu;->j0(II[B)[B

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v0, p1}, Lc12;->c(Ljava/lang/String;[B)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p1, [B

    .line 57
    .line 58
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lcom/github/luben/zstd/ZstdInputStream;

    .line 69
    .line 70
    invoke-direct {v1, v0}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 71
    .line 72
    .line 73
    :try_start_1
    invoke-static {v1, p1}, Lgv3;->m(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    :try_start_2
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    .line 79
    :try_start_3
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v0, Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {v0, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Ll72;->b:Loh7;

    .line 95
    .line 96
    :cond_0
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    move-object v1, p1

    .line 101
    check-cast v1, Ljava/util/Map;

    .line 102
    .line 103
    sget-object v1, Lyw2;->c:Lcom/google/gson/a;

    .line 104
    .line 105
    new-instance v2, Lk72;

    .line 106
    .line 107
    invoke-direct {v2}, Lyi8;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v2, v2, Lyi8;->b:Ljava/lang/reflect/Type;

    .line 111
    .line 112
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/a;->d(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    check-cast v1, Ljava/util/Map;

    .line 120
    .line 121
    invoke-virtual {p0, p1, v1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 125
    if-eqz p1, :cond_0

    .line 126
    .line 127
    return-object v1

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    goto :goto_0

    .line 130
    :catchall_1
    move-exception p0

    .line 131
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 132
    :catchall_2
    move-exception v0

    .line 133
    :try_start_5
    invoke-static {p1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 137
    :goto_0
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 138
    :catchall_3
    move-exception p1

    .line 139
    :try_start_7
    invoke-static {v1, p0}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 143
    :catchall_4
    move-exception p0

    .line 144
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 145
    .line 146
    if-nez p1, :cond_1

    .line 147
    .line 148
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 149
    .line 150
    if-nez p1, :cond_1

    .line 151
    .line 152
    new-instance p1, Lrj6;

    .line 153
    .line 154
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    return-object p1

    .line 158
    :cond_1
    throw p0
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-object p0, p0, Ll72;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    const-string v2, "extra_file_timestamp"

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->f(JLjava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    cmp-long v0, v2, v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    new-instance p0, Ljava/io/File;

    .line 34
    .line 35
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 36
    .line 37
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "data.result"

    .line 46
    .line 47
    invoke-direct {p0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    sget-object p0, Lwe3;->a:Lmu0;

    .line 57
    .line 58
    invoke-interface {p0}, Lmu0;->a()Lte3;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Lte3;->a()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    sub-long/2addr v2, v0

    .line 67
    const-wide/32 v0, 0x5265c00

    .line 68
    .line 69
    .line 70
    cmp-long p0, v2, v0

    .line 71
    .line 72
    if-lez p0, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 78
    return p0
.end method

.method public final f()Z
    .locals 4

    .line 1
    iget-object p0, p0, Ll72;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    const-wide/16 v0, -0x1

    .line 10
    .line 11
    const-string v2, "extra_file_timestamp"

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->f(JLjava/lang/String;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    cmp-long v0, v2, v0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p0, v1

    .line 28
    :goto_0
    const-string v0, "1792654306601"

    .line 29
    .line 30
    invoke-static {v0}, Lmm7;->c0(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    filled-new-array {p0, v0}, [Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Leu;->q0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Comparable;

    .line 58
    .line 59
    :goto_1
    move-object v1, v0

    .line 60
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/Comparable;

    .line 71
    .line 72
    invoke-interface {v1, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-gez v2, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    :goto_2
    check-cast v1, Ljava/lang/Long;

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    sget-object p0, Lwe3;->a:Lmu0;

    .line 88
    .line 89
    invoke-interface {p0}, Lmu0;->a()Lte3;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Lte3;->a()J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    sub-long/2addr v2, v0

    .line 98
    const-wide/32 v0, 0xa4cb800

    .line 99
    .line 100
    .line 101
    cmp-long p0, v2, v0

    .line 102
    .line 103
    if-lez p0, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    const/4 p0, 0x0

    .line 107
    return p0

    .line 108
    :cond_5
    :goto_3
    const/4 p0, 0x1

    .line 109
    return p0
.end method
