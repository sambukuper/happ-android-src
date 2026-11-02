.class public abstract Lu28;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static final a(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;
    .locals 22

    .line 1
    sget-object v0, Loi5;->Y:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "/"

    .line 4
    .line 5
    invoke-static {v0}, Lg55;->r(Ljava/lang/String;)Loi5;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v1, Lk79;

    .line 10
    .line 11
    const/16 v18, 0x0

    .line 12
    .line 13
    const v19, 0xfffc

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    const-wide/16 v9, 0x0

    .line 23
    .line 24
    const/4 v11, 0x0

    .line 25
    const-wide/16 v12, 0x0

    .line 26
    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    invoke-direct/range {v1 .. v19}, Lk79;-><init>(Loi5;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lqg5;

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v0}, [Lqg5;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lzp4;->K([Lqg5;)Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lmv4;

    .line 50
    .line 51
    const/16 v2, 0xd

    .line 52
    .line 53
    invoke-direct {v1, v2}, Lmv4;-><init>(B)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v2, p0

    .line 57
    .line 58
    invoke-static {v2, v1}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lk79;

    .line 77
    .line 78
    iget-object v3, v2, Lk79;->a:Loi5;

    .line 79
    .line 80
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Lk79;

    .line 85
    .line 86
    if-nez v3, :cond_0

    .line 87
    .line 88
    :goto_1
    iget-object v2, v2, Lk79;->a:Loi5;

    .line 89
    .line 90
    invoke-virtual {v2}, Loi5;->c()Loi5;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-nez v4, :cond_1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lk79;

    .line 102
    .line 103
    if-eqz v3, :cond_2

    .line 104
    .line 105
    iget-object v3, v3, Lk79;->q:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    new-instance v3, Lk79;

    .line 112
    .line 113
    const/16 v20, 0x0

    .line 114
    .line 115
    const v21, 0xfffc

    .line 116
    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    const/4 v6, 0x0

    .line 120
    const-wide/16 v7, 0x0

    .line 121
    .line 122
    const-wide/16 v9, 0x0

    .line 123
    .line 124
    const-wide/16 v11, 0x0

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const-wide/16 v14, 0x0

    .line 128
    .line 129
    const/16 v16, 0x0

    .line 130
    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    const/16 v19, 0x0

    .line 136
    .line 137
    invoke-direct/range {v3 .. v21}, Lk79;-><init>(Loi5;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    iget-object v4, v3, Lk79;->q:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-object v2, v3

    .line 149
    goto :goto_1

    .line 150
    :cond_3
    return-object v0
.end method

.method public static b(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {p0, p1}, Lu28;->c(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    :cond_0
    return p0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :catchall_1
    move-exception p0

    .line 18
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 22
    .line 23
    .line 24
    :catch_1
    :cond_1
    throw p0
.end method

.method public static c(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x400

    .line 13
    .line 14
    :try_start_1
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-eq v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    move-object v2, v3

    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception p0

    .line 31
    move-object v2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 34
    .line 35
    .line 36
    :catch_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catchall_1
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :catch_2
    move-exception p0

    .line 44
    :goto_1
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 45
    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 50
    .line 51
    .line 52
    :catch_3
    :cond_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 53
    .line 54
    .line 55
    return v1

    .line 56
    :goto_2
    if-eqz v2, :cond_2

    .line 57
    .line 58
    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 59
    .line 60
    .line 61
    :catch_4
    :cond_2
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 62
    .line 63
    .line 64
    throw p0
.end method

.method public static d(Lx50;)Lb10;
    .locals 11

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    move-wide v6, v0

    .line 6
    move-wide v9, v6

    .line 7
    move-object v4, v2

    .line 8
    move-object v5, v4

    .line 9
    move-object v8, v5

    .line 10
    :goto_0
    invoke-virtual {p0}, Lx50;->i()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    ushr-int/lit8 v1, v0, 0x3

    .line 17
    .line 18
    and-int/lit8 v0, v0, 0x7

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lx50;->k(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_0
    invoke-static {v1, v2, v0}, Lx50;->c(III)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lx50;->h()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v8, v0

    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lx50;->j()J

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_2
    invoke-static {v1, v2, v0}, Lx50;->c(III)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lx50;->h()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v5, v0

    .line 53
    goto :goto_0

    .line 54
    :pswitch_3
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lx50;->j()J

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_4
    invoke-static {v1, v2, v0}, Lx50;->c(III)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lx50;->h()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    move-object v4, v0

    .line 69
    goto :goto_0

    .line 70
    :pswitch_5
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lx50;->j()J

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_6
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lx50;->j()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    move-wide v9, v0

    .line 85
    goto :goto_0

    .line 86
    :pswitch_7
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lx50;->j()J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    move-wide v6, v0

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    new-instance v3, Lb10;

    .line 96
    .line 97
    invoke-direct/range {v3 .. v10}, Lb10;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V

    .line 98
    .line 99
    .line 100
    return-object v3

    .line 101
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Lx50;)Lk42;
    .locals 5

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lx50;->i()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    ushr-int/lit8 v1, v0, 0x3

    .line 8
    .line 9
    and-int/lit8 v0, v0, 0x7

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq v1, v2, :cond_6

    .line 14
    .line 15
    if-eq v1, v3, :cond_5

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    if-eq v1, v4, :cond_4

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    if-eq v1, v4, :cond_3

    .line 22
    .line 23
    const/4 v4, 0x6

    .line 24
    if-eq v1, v4, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lx50;->k(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lx50;->g()Lx50;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :goto_1
    invoke-virtual {v0}, Lx50;->i()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    ushr-int/lit8 v4, v1, 0x3

    .line 44
    .line 45
    and-int/lit8 v1, v1, 0x7

    .line 46
    .line 47
    if-eq v4, v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lx50;->k(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v4, v3, v1}, Lx50;->c(III)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lx50;->f()[B

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lx50;->f()[B

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    const/4 v2, 0x0

    .line 68
    invoke-static {v1, v2, v0}, Lx50;->c(III)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lx50;->j()J

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lx50;->h()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    invoke-static {v1, v3, v0}, Lx50;->c(III)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lx50;->h()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_7
    new-instance p0, Lk42;

    .line 90
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    return-object p0
.end method

.method public static f(Lx50;Ljava/util/HashMap;)V
    .locals 21

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v0

    .line 4
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lx50;->i()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    if-eqz v3, :cond_6

    .line 9
    .line 10
    ushr-int/lit8 v4, v3, 0x3

    .line 11
    .line 12
    and-int/lit8 v3, v3, 0x7

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    if-eq v4, v5, :cond_5

    .line 16
    .line 17
    const/4 v6, 0x2

    .line 18
    if-eq v4, v6, :cond_0

    .line 19
    .line 20
    move-object/from16 v7, p0

    .line 21
    .line 22
    invoke-virtual {v7, v3}, Lx50;->k(I)V

    .line 23
    .line 24
    .line 25
    move v5, v0

    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_0
    move-object/from16 v7, p0

    .line 29
    .line 30
    invoke-static {v4, v6, v3}, Lx50;->c(III)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v7}, Lx50;->g()Lx50;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v11, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v12, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v13, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v14, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v15, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v3, ""

    .line 63
    .line 64
    move v9, v0

    .line 65
    move-object v10, v3

    .line 66
    :goto_1
    invoke-virtual {v1}, Lx50;->i()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_4

    .line 71
    .line 72
    ushr-int/lit8 v8, v4, 0x3

    .line 73
    .line 74
    and-int/lit8 v4, v4, 0x7

    .line 75
    .line 76
    packed-switch v8, :pswitch_data_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v4}, Lx50;->k(I)V

    .line 80
    .line 81
    .line 82
    :goto_2
    move-object/from16 v20, v1

    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :pswitch_0
    invoke-static {v8, v6, v4}, Lx50;->c(III)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lx50;->h()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_1
    invoke-static {v8, v0, v4}, Lx50;->c(III)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lx50;->j()J

    .line 101
    .line 102
    .line 103
    :goto_3
    move v5, v0

    .line 104
    move-object/from16 v20, v1

    .line 105
    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :pswitch_2
    invoke-static {v8, v6, v4}, Lx50;->c(III)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lx50;->h()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :pswitch_3
    invoke-static {v8, v0, v4}, Lx50;->c(III)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Lx50;->j()J

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :pswitch_4
    invoke-static {v8, v6, v4}, Lx50;->c(III)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lx50;->g()Lx50;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-static {v4}, Lu28;->e(Lx50;)Lk42;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :pswitch_5
    invoke-static {v8, v6, v4}, Lx50;->c(III)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lx50;->g()Lx50;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v4}, Lu28;->d(Lx50;)Lb10;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :pswitch_6
    invoke-static {v8, v6, v4}, Lx50;->c(III)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Lx50;->g()Lx50;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const-wide/16 v16, 0x0

    .line 164
    .line 165
    move-object v8, v3

    .line 166
    move-wide/from16 v18, v16

    .line 167
    .line 168
    :goto_4
    invoke-virtual {v4}, Lx50;->i()I

    .line 169
    .line 170
    .line 171
    move-result v16

    .line 172
    if-eqz v16, :cond_3

    .line 173
    .line 174
    ushr-int/lit8 v0, v16, 0x3

    .line 175
    .line 176
    move-object/from16 v20, v1

    .line 177
    .line 178
    and-int/lit8 v1, v16, 0x7

    .line 179
    .line 180
    if-eq v0, v5, :cond_2

    .line 181
    .line 182
    if-eq v0, v6, :cond_1

    .line 183
    .line 184
    invoke-virtual {v4, v1}, Lx50;->k(I)V

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_1
    const/4 v5, 0x0

    .line 189
    invoke-static {v0, v5, v1}, Lx50;->c(III)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Lx50;->j()J

    .line 193
    .line 194
    .line 195
    move-result-wide v0

    .line 196
    move-wide/from16 v18, v0

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_2
    invoke-static {v0, v6, v1}, Lx50;->c(III)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4}, Lx50;->h()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    :goto_5
    move-object/from16 v1, v20

    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    const/4 v5, 0x1

    .line 210
    goto :goto_4

    .line 211
    :cond_3
    move-object/from16 v20, v1

    .line 212
    .line 213
    new-instance v0, Lnc6;

    .line 214
    .line 215
    move-wide/from16 v4, v18

    .line 216
    .line 217
    invoke-direct {v0, v4, v5, v8}, Lnc6;-><init>(JLjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    :goto_6
    const/4 v5, 0x0

    .line 224
    goto :goto_7

    .line 225
    :pswitch_7
    move-object/from16 v20, v1

    .line 226
    .line 227
    invoke-static {v8, v6, v4}, Lx50;->c(III)V

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v20}, Lx50;->h()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    goto :goto_6

    .line 235
    :pswitch_8
    move v5, v0

    .line 236
    move-object/from16 v20, v1

    .line 237
    .line 238
    invoke-static {v8, v5, v4}, Lx50;->c(III)V

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v20}, Lx50;->j()J

    .line 242
    .line 243
    .line 244
    move-result-wide v0

    .line 245
    long-to-int v9, v0

    .line 246
    :goto_7
    move v0, v5

    .line 247
    move-object/from16 v1, v20

    .line 248
    .line 249
    const/4 v5, 0x1

    .line 250
    goto/16 :goto_1

    .line 251
    .line 252
    :cond_4
    move v5, v0

    .line 253
    new-instance v8, Lmb8;

    .line 254
    .line 255
    invoke-direct/range {v8 .. v15}, Lmb8;-><init>(ILjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 256
    .line 257
    .line 258
    move-object v1, v8

    .line 259
    goto :goto_8

    .line 260
    :cond_5
    move-object/from16 v7, p0

    .line 261
    .line 262
    move v5, v0

    .line 263
    invoke-static {v4, v5, v3}, Lx50;->c(III)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7}, Lx50;->j()J

    .line 267
    .line 268
    .line 269
    move-result-wide v2

    .line 270
    long-to-int v2, v2

    .line 271
    :goto_8
    move v0, v5

    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_6
    if-eqz v1, :cond_7

    .line 275
    .line 276
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    move-object/from16 v2, p1

    .line 281
    .line 282
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    :cond_7
    return-void

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final g(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Lkm4;->q(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "0x"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static h(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, ".font"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "-"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    const/16 v3, 0x64

    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    new-instance v3, Ljava/io/File;

    .line 48
    .line 49
    invoke-static {v2, v1}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 57
    .line 58
    .line 59
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    return-object v3

    .line 63
    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v0
.end method

.method public static final i(Lql;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lql;->Y:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lql;->X:Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    move v3, v1

    .line 17
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lpl;

    .line 24
    .line 25
    iget-object v5, v4, Lpl;->a:Ljava/lang/Object;

    .line 26
    .line 27
    instance-of v5, v5, Lpa4;

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    iget v5, v4, Lpl;->b:I

    .line 32
    .line 33
    iget v4, v4, Lpl;->c:I

    .line 34
    .line 35
    invoke-static {v1, v0, v5, v4}, Lrl;->b(IIII)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return v1
.end method

.method public static final j(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lh73;
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ldi;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, v4, Ldi;->d:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    iput v5, v4, Ldi;->a:I

    .line 20
    .line 21
    new-instance v6, Lq02;

    .line 22
    .line 23
    const/16 v7, 0x1c

    .line 24
    .line 25
    invoke-direct {v6, v7}, Lq02;-><init>(B)V

    .line 26
    .line 27
    .line 28
    const/16 v7, 0x40

    .line 29
    .line 30
    new-array v7, v7, [F

    .line 31
    .line 32
    iput-object v7, v6, Lq02;->Y:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v6, v4, Ldi;->e:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v6, v4, Ldi;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v6, Lorg/xmlpull/v1/XmlPullParser;

    .line 39
    .line 40
    sget-object v7, Lw51;->a:[I

    .line 41
    .line 42
    invoke-static {v1, v0, v3, v7}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    invoke-virtual {v4, v8}, Ldi;->d(I)V

    .line 51
    .line 52
    .line 53
    const-string v8, "autoMirrored"

    .line 54
    .line 55
    invoke-static {v2, v8}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const/4 v9, 0x5

    .line 60
    if-nez v8, :cond_0

    .line 61
    .line 62
    move/from16 v19, v5

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v7, v9, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    move/from16 v19, v8

    .line 70
    .line 71
    :goto_0
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-virtual {v4, v8}, Ldi;->d(I)V

    .line 76
    .line 77
    .line 78
    const-string v8, "viewportWidth"

    .line 79
    .line 80
    const/4 v10, 0x7

    .line 81
    const/4 v11, 0x0

    .line 82
    invoke-virtual {v4, v7, v8, v10, v11}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    const-string v8, "viewportHeight"

    .line 87
    .line 88
    const/16 v12, 0x8

    .line 89
    .line 90
    invoke-virtual {v4, v7, v8, v12, v11}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 91
    .line 92
    .line 93
    move-result v15

    .line 94
    cmpg-float v8, v14, v11

    .line 95
    .line 96
    if-lez v8, :cond_33

    .line 97
    .line 98
    cmpg-float v8, v15, v11

    .line 99
    .line 100
    if-lez v8, :cond_32

    .line 101
    .line 102
    const/4 v8, 0x3

    .line 103
    invoke-virtual {v7, v8, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 104
    .line 105
    .line 106
    move-result v13

    .line 107
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    invoke-virtual {v4, v10}, Ldi;->d(I)V

    .line 112
    .line 113
    .line 114
    const/4 v10, 0x2

    .line 115
    invoke-virtual {v7, v10, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 116
    .line 117
    .line 118
    move-result v17

    .line 119
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    invoke-virtual {v4, v11}, Ldi;->d(I)V

    .line 124
    .line 125
    .line 126
    const/4 v11, 0x1

    .line 127
    invoke-virtual {v7, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 128
    .line 129
    .line 130
    move-result v20

    .line 131
    if-eqz v20, :cond_3

    .line 132
    .line 133
    new-instance v12, Landroid/util/TypedValue;

    .line 134
    .line 135
    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v11, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 139
    .line 140
    .line 141
    iget v12, v12, Landroid/util/TypedValue;->type:I

    .line 142
    .line 143
    if-ne v12, v10, :cond_1

    .line 144
    .line 145
    sget-wide v21, Ldw0;->g:J

    .line 146
    .line 147
    move-wide/from16 v22, v21

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_1
    invoke-static {v7, v2, v0}, La28;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    invoke-virtual {v4, v10}, Ldi;->d(I)V

    .line 159
    .line 160
    .line 161
    if-eqz v12, :cond_2

    .line 162
    .line 163
    invoke-virtual {v12}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-static {v10}, Lz51;->d(I)J

    .line 168
    .line 169
    .line 170
    move-result-wide v22

    .line 171
    goto :goto_1

    .line 172
    :cond_2
    sget-wide v22, Ldw0;->g:J

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    sget-wide v22, Ldw0;->g:J

    .line 176
    .line 177
    :goto_1
    const/4 v10, 0x6

    .line 178
    const/4 v12, -0x1

    .line 179
    invoke-virtual {v7, v10, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 184
    .line 185
    .line 186
    move-result v10

    .line 187
    invoke-virtual {v4, v10}, Ldi;->d(I)V

    .line 188
    .line 189
    .line 190
    const/16 v5, 0x9

    .line 191
    .line 192
    if-eq v11, v12, :cond_4

    .line 193
    .line 194
    if-eq v11, v8, :cond_6

    .line 195
    .line 196
    if-eq v11, v9, :cond_4

    .line 197
    .line 198
    if-eq v11, v5, :cond_5

    .line 199
    .line 200
    packed-switch v11, :pswitch_data_0

    .line 201
    .line 202
    .line 203
    :cond_4
    move v11, v9

    .line 204
    goto :goto_2

    .line 205
    :pswitch_0
    const/16 v11, 0xc

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :pswitch_1
    const/16 v11, 0xe

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :pswitch_2
    const/16 v11, 0xd

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    move v11, v5

    .line 215
    goto :goto_2

    .line 216
    :cond_6
    move v11, v8

    .line 217
    :goto_2
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 222
    .line 223
    div-float/2addr v13, v10

    .line 224
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 229
    .line 230
    div-float v17, v17, v10

    .line 231
    .line 232
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 233
    .line 234
    .line 235
    new-instance v10, Lf73;

    .line 236
    .line 237
    move/from16 v18, v11

    .line 238
    .line 239
    const/4 v7, 0x0

    .line 240
    const/4 v11, 0x0

    .line 241
    const/16 v25, 0x8

    .line 242
    .line 243
    const/16 v20, 0x1

    .line 244
    .line 245
    move v12, v13

    .line 246
    move/from16 v13, v17

    .line 247
    .line 248
    move-wide/from16 v16, v22

    .line 249
    .line 250
    const/4 v5, 0x1

    .line 251
    const/4 v7, 0x2

    .line 252
    invoke-direct/range {v10 .. v20}, Lf73;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 253
    .line 254
    .line 255
    const/4 v11, 0x0

    .line 256
    :goto_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 257
    .line 258
    .line 259
    move-result v12

    .line 260
    if-eq v12, v5, :cond_31

    .line 261
    .line 262
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    if-ge v12, v5, :cond_7

    .line 267
    .line 268
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    if-ne v12, v8, :cond_7

    .line 273
    .line 274
    goto/16 :goto_23

    .line 275
    .line 276
    :cond_7
    iget-object v12, v4, Ldi;->e:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v12, Lq02;

    .line 279
    .line 280
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 281
    .line 282
    .line 283
    move-result v13

    .line 284
    const-string v14, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 285
    .line 286
    iget-object v15, v10, Lf73;->i:Ljava/util/ArrayList;

    .line 287
    .line 288
    const-string v9, "group"

    .line 289
    .line 290
    if-eq v13, v7, :cond_f

    .line 291
    .line 292
    if-eq v13, v8, :cond_9

    .line 293
    .line 294
    :cond_8
    move v8, v5

    .line 295
    move/from16 v18, v7

    .line 296
    .line 297
    const/4 v5, 0x0

    .line 298
    const/16 v7, 0xd

    .line 299
    .line 300
    goto/16 :goto_8

    .line 301
    .line 302
    :cond_9
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    if-eqz v9, :cond_8

    .line 311
    .line 312
    add-int/lit8 v11, v11, 0x1

    .line 313
    .line 314
    const/4 v9, 0x0

    .line 315
    :goto_4
    if-ge v9, v11, :cond_b

    .line 316
    .line 317
    iget-boolean v12, v10, Lf73;->k:Z

    .line 318
    .line 319
    if-eqz v12, :cond_a

    .line 320
    .line 321
    invoke-static {v14}, Lwc3;->b(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_a
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    sub-int/2addr v12, v5

    .line 329
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v12

    .line 333
    check-cast v12, Le73;

    .line 334
    .line 335
    invoke-static {v5, v15}, Loi0;->h(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v13

    .line 339
    check-cast v13, Le73;

    .line 340
    .line 341
    iget-object v13, v13, Le73;->j:Ljava/util/ArrayList;

    .line 342
    .line 343
    new-instance v27, Lfu8;

    .line 344
    .line 345
    iget-object v8, v12, Le73;->a:Ljava/lang/String;

    .line 346
    .line 347
    iget v7, v12, Le73;->b:F

    .line 348
    .line 349
    iget v5, v12, Le73;->c:F

    .line 350
    .line 351
    iget v2, v12, Le73;->d:F

    .line 352
    .line 353
    move/from16 v31, v2

    .line 354
    .line 355
    iget v2, v12, Le73;->e:F

    .line 356
    .line 357
    move/from16 v32, v2

    .line 358
    .line 359
    iget v2, v12, Le73;->f:F

    .line 360
    .line 361
    move/from16 v33, v2

    .line 362
    .line 363
    iget v2, v12, Le73;->g:F

    .line 364
    .line 365
    move/from16 v34, v2

    .line 366
    .line 367
    iget v2, v12, Le73;->h:F

    .line 368
    .line 369
    move/from16 v35, v2

    .line 370
    .line 371
    iget-object v2, v12, Le73;->i:Ljava/util/List;

    .line 372
    .line 373
    iget-object v12, v12, Le73;->j:Ljava/util/ArrayList;

    .line 374
    .line 375
    move-object/from16 v36, v2

    .line 376
    .line 377
    move/from16 v30, v5

    .line 378
    .line 379
    move/from16 v29, v7

    .line 380
    .line 381
    move-object/from16 v28, v8

    .line 382
    .line 383
    move-object/from16 v37, v12

    .line 384
    .line 385
    invoke-direct/range {v27 .. v37}, Lfu8;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/ArrayList;)V

    .line 386
    .line 387
    .line 388
    move-object/from16 v2, v27

    .line 389
    .line 390
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    add-int/lit8 v9, v9, 0x1

    .line 394
    .line 395
    move-object/from16 v2, p2

    .line 396
    .line 397
    const/4 v5, 0x1

    .line 398
    const/4 v7, 0x2

    .line 399
    const/4 v8, 0x3

    .line 400
    goto :goto_4

    .line 401
    :cond_b
    iget-object v2, v4, Ldi;->b:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, [I

    .line 404
    .line 405
    if-eqz v2, :cond_e

    .line 406
    .line 407
    iget v5, v4, Ldi;->c:I

    .line 408
    .line 409
    if-nez v5, :cond_c

    .line 410
    .line 411
    goto :goto_9

    .line 412
    :cond_c
    add-int/lit8 v5, v5, -0x1

    .line 413
    .line 414
    iput v5, v4, Ldi;->c:I

    .line 415
    .line 416
    aget v2, v2, v5

    .line 417
    .line 418
    move v11, v2

    .line 419
    :cond_d
    :goto_5
    const/4 v5, 0x0

    .line 420
    const/16 v7, 0xd

    .line 421
    .line 422
    :goto_6
    const/4 v8, 0x1

    .line 423
    :goto_7
    const/16 v18, 0x2

    .line 424
    .line 425
    :goto_8
    const/16 v21, 0x9

    .line 426
    .line 427
    const/16 v24, 0xc

    .line 428
    .line 429
    const/16 v25, 0x8

    .line 430
    .line 431
    const/16 v26, 0x0

    .line 432
    .line 433
    goto/16 :goto_22

    .line 434
    .line 435
    :cond_e
    :goto_9
    const/4 v5, 0x0

    .line 436
    const/16 v7, 0xd

    .line 437
    .line 438
    const/4 v8, 0x1

    .line 439
    const/4 v11, 0x0

    .line 440
    goto :goto_7

    .line 441
    :cond_f
    invoke-interface {v6}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    if-eqz v2, :cond_d

    .line 446
    .line 447
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    const v7, -0x624e8b7e

    .line 452
    .line 453
    .line 454
    sget-object v36, Ld02;->X:Ld02;

    .line 455
    .line 456
    const-string v8, ""

    .line 457
    .line 458
    if-eq v5, v7, :cond_2c

    .line 459
    .line 460
    const v7, 0x346425

    .line 461
    .line 462
    .line 463
    const/4 v13, 0x4

    .line 464
    if-eq v5, v7, :cond_16

    .line 465
    .line 466
    const v7, 0x5e0f67f

    .line 467
    .line 468
    .line 469
    if-eq v5, v7, :cond_10

    .line 470
    .line 471
    :goto_a
    goto :goto_5

    .line 472
    :cond_10
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-nez v2, :cond_11

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_11
    sget-object v2, Lw51;->b:[I

    .line 480
    .line 481
    invoke-static {v1, v0, v3, v2}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 490
    .line 491
    .line 492
    const-string v5, "rotation"

    .line 493
    .line 494
    const/4 v7, 0x5

    .line 495
    const/4 v9, 0x0

    .line 496
    invoke-virtual {v4, v2, v5, v7, v9}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 497
    .line 498
    .line 499
    move-result v29

    .line 500
    const/4 v5, 0x1

    .line 501
    invoke-virtual {v2, v5, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 502
    .line 503
    .line 504
    move-result v30

    .line 505
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 510
    .line 511
    .line 512
    const/4 v7, 0x2

    .line 513
    invoke-virtual {v2, v7, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 514
    .line 515
    .line 516
    move-result v31

    .line 517
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 522
    .line 523
    .line 524
    const-string v5, "scaleX"

    .line 525
    .line 526
    const/4 v7, 0x3

    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    invoke-virtual {v4, v2, v5, v7, v12}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 530
    .line 531
    .line 532
    move-result v32

    .line 533
    const-string v5, "scaleY"

    .line 534
    .line 535
    invoke-virtual {v4, v2, v5, v13, v12}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 536
    .line 537
    .line 538
    move-result v33

    .line 539
    const-string v5, "translateX"

    .line 540
    .line 541
    const/4 v7, 0x6

    .line 542
    invoke-virtual {v4, v2, v5, v7, v9}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 543
    .line 544
    .line 545
    move-result v34

    .line 546
    const-string v5, "translateY"

    .line 547
    .line 548
    const/4 v12, 0x7

    .line 549
    invoke-virtual {v4, v2, v5, v12, v9}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 550
    .line 551
    .line 552
    move-result v35

    .line 553
    const/4 v5, 0x0

    .line 554
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v19

    .line 558
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 563
    .line 564
    .line 565
    if-nez v19, :cond_12

    .line 566
    .line 567
    move-object/from16 v28, v8

    .line 568
    .line 569
    goto :goto_b

    .line 570
    :cond_12
    move-object/from16 v28, v19

    .line 571
    .line 572
    :goto_b
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 573
    .line 574
    .line 575
    sget v2, Lgu8;->a:I

    .line 576
    .line 577
    iget-boolean v2, v10, Lf73;->k:Z

    .line 578
    .line 579
    if-eqz v2, :cond_13

    .line 580
    .line 581
    invoke-static {v14}, Lwc3;->b(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    :cond_13
    new-instance v27, Le73;

    .line 585
    .line 586
    const/16 v37, 0x200

    .line 587
    .line 588
    invoke-direct/range {v27 .. v37}, Le73;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 589
    .line 590
    .line 591
    move-object/from16 v2, v27

    .line 592
    .line 593
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    iget-object v2, v4, Ldi;->b:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v2, [I

    .line 599
    .line 600
    if-nez v2, :cond_14

    .line 601
    .line 602
    new-array v2, v13, [I

    .line 603
    .line 604
    iput-object v2, v4, Ldi;->b:Ljava/lang/Object;

    .line 605
    .line 606
    goto :goto_c

    .line 607
    :cond_14
    iget v5, v4, Ldi;->c:I

    .line 608
    .line 609
    array-length v8, v2

    .line 610
    if-lt v5, v8, :cond_15

    .line 611
    .line 612
    array-length v5, v2

    .line 613
    const/16 v18, 0x2

    .line 614
    .line 615
    mul-int/lit8 v5, v5, 0x2

    .line 616
    .line 617
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    iput-object v2, v4, Ldi;->b:Ljava/lang/Object;

    .line 622
    .line 623
    :cond_15
    :goto_c
    iget v5, v4, Ldi;->c:I

    .line 624
    .line 625
    add-int/lit8 v8, v5, 0x1

    .line 626
    .line 627
    iput v8, v4, Ldi;->c:I

    .line 628
    .line 629
    aput v11, v2, v5

    .line 630
    .line 631
    move/from16 v26, v9

    .line 632
    .line 633
    const/4 v5, 0x0

    .line 634
    const/16 v7, 0xd

    .line 635
    .line 636
    const/4 v8, 0x1

    .line 637
    const/4 v11, 0x0

    .line 638
    :goto_d
    const/16 v18, 0x2

    .line 639
    .line 640
    const/16 v21, 0x9

    .line 641
    .line 642
    const/16 v24, 0xc

    .line 643
    .line 644
    const/16 v25, 0x8

    .line 645
    .line 646
    goto/16 :goto_22

    .line 647
    .line 648
    :cond_16
    const/4 v7, 0x6

    .line 649
    const/4 v9, 0x0

    .line 650
    const-string v5, "path"

    .line 651
    .line 652
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    if-nez v2, :cond_17

    .line 657
    .line 658
    move/from16 v26, v9

    .line 659
    .line 660
    const/4 v5, 0x0

    .line 661
    const/16 v7, 0xd

    .line 662
    .line 663
    const/4 v8, 0x1

    .line 664
    goto :goto_d

    .line 665
    :cond_17
    sget-object v2, Lw51;->c:[I

    .line 666
    .line 667
    invoke-static {v1, v0, v3, v2}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 676
    .line 677
    .line 678
    const-string v5, "pathData"

    .line 679
    .line 680
    const-string v9, "http://schemas.android.com/apk/res/android"

    .line 681
    .line 682
    invoke-interface {v6, v9, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v5

    .line 686
    if-eqz v5, :cond_2b

    .line 687
    .line 688
    const/4 v5, 0x0

    .line 689
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v20

    .line 693
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 698
    .line 699
    .line 700
    if-nez v20, :cond_18

    .line 701
    .line 702
    move-object/from16 v38, v8

    .line 703
    .line 704
    :goto_e
    const/4 v5, 0x2

    .line 705
    goto :goto_f

    .line 706
    :cond_18
    move-object/from16 v38, v20

    .line 707
    .line 708
    goto :goto_e

    .line 709
    :goto_f
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v8

    .line 713
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 714
    .line 715
    .line 716
    move-result v5

    .line 717
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 718
    .line 719
    .line 720
    if-nez v8, :cond_19

    .line 721
    .line 722
    sget v5, Lgu8;->a:I

    .line 723
    .line 724
    :goto_10
    move-object/from16 v39, v36

    .line 725
    .line 726
    goto :goto_11

    .line 727
    :cond_19
    invoke-static {v12, v8}, Lq02;->P(Lq02;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 728
    .line 729
    .line 730
    move-result-object v36

    .line 731
    goto :goto_10

    .line 732
    :goto_11
    const-string v5, "fillColor"

    .line 733
    .line 734
    const/4 v8, 0x1

    .line 735
    invoke-static {v2, v6, v0, v5, v8}, La28;->h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lne;

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 740
    .line 741
    .line 742
    move-result v8

    .line 743
    invoke-virtual {v4, v8}, Ldi;->d(I)V

    .line 744
    .line 745
    .line 746
    const-string v8, "fillAlpha"

    .line 747
    .line 748
    const/high16 v9, 0x3f800000    # 1.0f

    .line 749
    .line 750
    const/16 v12, 0xc

    .line 751
    .line 752
    const/16 v20, 0x0

    .line 753
    .line 754
    invoke-virtual {v4, v2, v8, v12, v9}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 755
    .line 756
    .line 757
    move-result v42

    .line 758
    const-string v8, "strokeLineCap"

    .line 759
    .line 760
    invoke-static {v6, v8}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 761
    .line 762
    .line 763
    move-result v8

    .line 764
    if-nez v8, :cond_1a

    .line 765
    .line 766
    const/4 v8, -0x1

    .line 767
    const/4 v9, -0x1

    .line 768
    goto :goto_12

    .line 769
    :cond_1a
    const/16 v8, 0x8

    .line 770
    .line 771
    const/4 v9, -0x1

    .line 772
    invoke-virtual {v2, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 773
    .line 774
    .line 775
    move-result v22

    .line 776
    move/from16 v8, v22

    .line 777
    .line 778
    :goto_12
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 779
    .line 780
    .line 781
    move-result v12

    .line 782
    invoke-virtual {v4, v12}, Ldi;->d(I)V

    .line 783
    .line 784
    .line 785
    if-eqz v8, :cond_1b

    .line 786
    .line 787
    const/4 v12, 0x1

    .line 788
    if-eq v8, v12, :cond_1d

    .line 789
    .line 790
    const/4 v12, 0x2

    .line 791
    if-eq v8, v12, :cond_1c

    .line 792
    .line 793
    :cond_1b
    const/16 v46, 0x0

    .line 794
    .line 795
    goto :goto_13

    .line 796
    :cond_1c
    const/16 v46, 0x2

    .line 797
    .line 798
    goto :goto_13

    .line 799
    :cond_1d
    const/16 v46, 0x1

    .line 800
    .line 801
    :goto_13
    const-string v8, "strokeLineJoin"

    .line 802
    .line 803
    invoke-static {v6, v8}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 804
    .line 805
    .line 806
    move-result v8

    .line 807
    if-nez v8, :cond_1e

    .line 808
    .line 809
    move v12, v9

    .line 810
    goto :goto_14

    .line 811
    :cond_1e
    const/16 v8, 0x9

    .line 812
    .line 813
    invoke-virtual {v2, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 814
    .line 815
    .line 816
    move-result v12

    .line 817
    :goto_14
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 818
    .line 819
    .line 820
    move-result v8

    .line 821
    invoke-virtual {v4, v8}, Ldi;->d(I)V

    .line 822
    .line 823
    .line 824
    if-eqz v12, :cond_21

    .line 825
    .line 826
    const/4 v8, 0x1

    .line 827
    if-eq v12, v8, :cond_20

    .line 828
    .line 829
    const/4 v8, 0x2

    .line 830
    if-eq v12, v8, :cond_1f

    .line 831
    .line 832
    :goto_15
    const/16 v47, 0x0

    .line 833
    .line 834
    goto :goto_16

    .line 835
    :cond_1f
    move/from16 v47, v8

    .line 836
    .line 837
    goto :goto_16

    .line 838
    :cond_20
    const/4 v8, 0x2

    .line 839
    const/16 v47, 0x1

    .line 840
    .line 841
    goto :goto_16

    .line 842
    :cond_21
    const/4 v8, 0x2

    .line 843
    goto :goto_15

    .line 844
    :goto_16
    const/16 v12, 0xa

    .line 845
    .line 846
    const/high16 v8, 0x40800000    # 4.0f

    .line 847
    .line 848
    const-string v9, "strokeMiterLimit"

    .line 849
    .line 850
    invoke-virtual {v4, v2, v9, v12, v8}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 851
    .line 852
    .line 853
    move-result v48

    .line 854
    const-string v8, "strokeColor"

    .line 855
    .line 856
    const/4 v9, 0x3

    .line 857
    invoke-static {v2, v6, v0, v8, v9}, La28;->h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lne;

    .line 858
    .line 859
    .line 860
    move-result-object v8

    .line 861
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 862
    .line 863
    .line 864
    move-result v12

    .line 865
    invoke-virtual {v4, v12}, Ldi;->d(I)V

    .line 866
    .line 867
    .line 868
    const-string v12, "strokeAlpha"

    .line 869
    .line 870
    const/16 v9, 0xb

    .line 871
    .line 872
    const/high16 v7, 0x3f800000    # 1.0f

    .line 873
    .line 874
    invoke-virtual {v4, v2, v12, v9, v7}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 875
    .line 876
    .line 877
    move-result v44

    .line 878
    const-string v9, "strokeWidth"

    .line 879
    .line 880
    invoke-virtual {v4, v2, v9, v13, v7}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 881
    .line 882
    .line 883
    move-result v45

    .line 884
    const-string v9, "trimPathEnd"

    .line 885
    .line 886
    const/4 v13, 0x6

    .line 887
    invoke-virtual {v4, v2, v9, v13, v7}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 888
    .line 889
    .line 890
    move-result v50

    .line 891
    const-string v7, "trimPathOffset"

    .line 892
    .line 893
    const/4 v9, 0x7

    .line 894
    const/4 v12, 0x0

    .line 895
    invoke-virtual {v4, v2, v7, v9, v12}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 896
    .line 897
    .line 898
    move-result v51

    .line 899
    const-string v7, "trimPathStart"

    .line 900
    .line 901
    const/4 v9, 0x5

    .line 902
    invoke-virtual {v4, v2, v7, v9, v12}, Ldi;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 903
    .line 904
    .line 905
    move-result v49

    .line 906
    const-string v7, "fillType"

    .line 907
    .line 908
    invoke-static {v6, v7}, La28;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 909
    .line 910
    .line 911
    move-result v7

    .line 912
    if-nez v7, :cond_22

    .line 913
    .line 914
    const/16 v7, 0xd

    .line 915
    .line 916
    const/16 v19, 0x0

    .line 917
    .line 918
    goto :goto_17

    .line 919
    :cond_22
    const/16 v7, 0xd

    .line 920
    .line 921
    const/4 v9, 0x0

    .line 922
    invoke-virtual {v2, v7, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 923
    .line 924
    .line 925
    move-result v19

    .line 926
    :goto_17
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 927
    .line 928
    .line 929
    move-result v9

    .line 930
    invoke-virtual {v4, v9}, Ldi;->d(I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 934
    .line 935
    .line 936
    iget-object v2, v5, Lne;->c:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v2, Landroid/graphics/Shader;

    .line 939
    .line 940
    if-eqz v2, :cond_23

    .line 941
    .line 942
    goto :goto_18

    .line 943
    :cond_23
    iget v9, v5, Lne;->b:I

    .line 944
    .line 945
    if-eqz v9, :cond_25

    .line 946
    .line 947
    :goto_18
    if-eqz v2, :cond_24

    .line 948
    .line 949
    new-instance v5, Le90;

    .line 950
    .line 951
    invoke-direct {v5, v2}, Le90;-><init>(Landroid/graphics/Shader;)V

    .line 952
    .line 953
    .line 954
    move-object/from16 v41, v5

    .line 955
    .line 956
    goto :goto_19

    .line 957
    :cond_24
    new-instance v2, Lfe7;

    .line 958
    .line 959
    iget v5, v5, Lne;->b:I

    .line 960
    .line 961
    invoke-static {v5}, Lz51;->d(I)J

    .line 962
    .line 963
    .line 964
    move-result-wide v12

    .line 965
    invoke-direct {v2, v12, v13}, Lfe7;-><init>(J)V

    .line 966
    .line 967
    .line 968
    move-object/from16 v41, v2

    .line 969
    .line 970
    goto :goto_19

    .line 971
    :cond_25
    move-object/from16 v41, v20

    .line 972
    .line 973
    :goto_19
    iget-object v2, v8, Lne;->c:Ljava/lang/Object;

    .line 974
    .line 975
    check-cast v2, Landroid/graphics/Shader;

    .line 976
    .line 977
    if-eqz v2, :cond_26

    .line 978
    .line 979
    goto :goto_1a

    .line 980
    :cond_26
    iget v5, v8, Lne;->b:I

    .line 981
    .line 982
    if-eqz v5, :cond_28

    .line 983
    .line 984
    :goto_1a
    if-eqz v2, :cond_27

    .line 985
    .line 986
    new-instance v9, Le90;

    .line 987
    .line 988
    invoke-direct {v9, v2}, Le90;-><init>(Landroid/graphics/Shader;)V

    .line 989
    .line 990
    .line 991
    :goto_1b
    move-object/from16 v43, v9

    .line 992
    .line 993
    goto :goto_1c

    .line 994
    :cond_27
    new-instance v9, Lfe7;

    .line 995
    .line 996
    iget v2, v8, Lne;->b:I

    .line 997
    .line 998
    invoke-static {v2}, Lz51;->d(I)J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v12

    .line 1002
    invoke-direct {v9, v12, v13}, Lfe7;-><init>(J)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_1b

    .line 1006
    :cond_28
    move-object/from16 v43, v20

    .line 1007
    .line 1008
    :goto_1c
    if-nez v19, :cond_29

    .line 1009
    .line 1010
    const/16 v40, 0x0

    .line 1011
    .line 1012
    goto :goto_1d

    .line 1013
    :cond_29
    const/16 v40, 0x1

    .line 1014
    .line 1015
    :goto_1d
    iget-boolean v2, v10, Lf73;->k:Z

    .line 1016
    .line 1017
    if-eqz v2, :cond_2a

    .line 1018
    .line 1019
    invoke-static {v14}, Lwc3;->b(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    :cond_2a
    const/4 v5, 0x1

    .line 1023
    invoke-static {v5, v15}, Loi0;->h(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v2

    .line 1027
    check-cast v2, Le73;

    .line 1028
    .line 1029
    iget-object v2, v2, Le73;->j:Ljava/util/ArrayList;

    .line 1030
    .line 1031
    new-instance v37, Liu8;

    .line 1032
    .line 1033
    invoke-direct/range {v37 .. v51}, Liu8;-><init>(Ljava/lang/String;Ljava/util/List;ILd90;FLd90;FFIIFFFF)V

    .line 1034
    .line 1035
    .line 1036
    move-object/from16 v5, v37

    .line 1037
    .line 1038
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1039
    .line 1040
    .line 1041
    const/4 v5, 0x0

    .line 1042
    goto/16 :goto_6

    .line 1043
    .line 1044
    :cond_2b
    const/16 v20, 0x0

    .line 1045
    .line 1046
    const-string v0, "No path data available"

    .line 1047
    .line 1048
    invoke-static {v0}, Lbt;->q(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    return-object v20

    .line 1052
    :cond_2c
    const/16 v7, 0xd

    .line 1053
    .line 1054
    const/16 v18, 0x2

    .line 1055
    .line 1056
    const/16 v21, 0x9

    .line 1057
    .line 1058
    const/16 v24, 0xc

    .line 1059
    .line 1060
    const/16 v25, 0x8

    .line 1061
    .line 1062
    const/16 v26, 0x0

    .line 1063
    .line 1064
    const-string v5, "clip-path"

    .line 1065
    .line 1066
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v2

    .line 1070
    if-nez v2, :cond_2d

    .line 1071
    .line 1072
    const/4 v5, 0x0

    .line 1073
    const/4 v8, 0x1

    .line 1074
    goto :goto_22

    .line 1075
    :cond_2d
    sget-object v2, Lw51;->d:[I

    .line 1076
    .line 1077
    invoke-static {v1, v0, v3, v2}, La28;->q(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1082
    .line 1083
    .line 1084
    move-result v5

    .line 1085
    invoke-virtual {v4, v5}, Ldi;->d(I)V

    .line 1086
    .line 1087
    .line 1088
    const/4 v5, 0x0

    .line 1089
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v9

    .line 1093
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1094
    .line 1095
    .line 1096
    move-result v13

    .line 1097
    invoke-virtual {v4, v13}, Ldi;->d(I)V

    .line 1098
    .line 1099
    .line 1100
    if-nez v9, :cond_2e

    .line 1101
    .line 1102
    move-object/from16 v38, v8

    .line 1103
    .line 1104
    :goto_1e
    const/4 v8, 0x1

    .line 1105
    goto :goto_1f

    .line 1106
    :cond_2e
    move-object/from16 v38, v9

    .line 1107
    .line 1108
    goto :goto_1e

    .line 1109
    :goto_1f
    invoke-virtual {v2, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v9

    .line 1113
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1114
    .line 1115
    .line 1116
    move-result v13

    .line 1117
    invoke-virtual {v4, v13}, Ldi;->d(I)V

    .line 1118
    .line 1119
    .line 1120
    if-nez v9, :cond_2f

    .line 1121
    .line 1122
    sget v9, Lgu8;->a:I

    .line 1123
    .line 1124
    :goto_20
    move-object/from16 v46, v36

    .line 1125
    .line 1126
    goto :goto_21

    .line 1127
    :cond_2f
    invoke-static {v12, v9}, Lq02;->P(Lq02;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v36

    .line 1131
    goto :goto_20

    .line 1132
    :goto_21
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 1133
    .line 1134
    .line 1135
    iget-boolean v2, v10, Lf73;->k:Z

    .line 1136
    .line 1137
    if-eqz v2, :cond_30

    .line 1138
    .line 1139
    invoke-static {v14}, Lwc3;->b(Ljava/lang/String;)V

    .line 1140
    .line 1141
    .line 1142
    :cond_30
    new-instance v37, Le73;

    .line 1143
    .line 1144
    const/16 v47, 0x200

    .line 1145
    .line 1146
    const/16 v39, 0x0

    .line 1147
    .line 1148
    const/16 v40, 0x0

    .line 1149
    .line 1150
    const/16 v41, 0x0

    .line 1151
    .line 1152
    const/high16 v42, 0x3f800000    # 1.0f

    .line 1153
    .line 1154
    const/high16 v43, 0x3f800000    # 1.0f

    .line 1155
    .line 1156
    const/16 v44, 0x0

    .line 1157
    .line 1158
    const/16 v45, 0x0

    .line 1159
    .line 1160
    invoke-direct/range {v37 .. v47}, Le73;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 1161
    .line 1162
    .line 1163
    move-object/from16 v2, v37

    .line 1164
    .line 1165
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    add-int/lit8 v11, v11, 0x1

    .line 1169
    .line 1170
    :goto_22
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1171
    .line 1172
    .line 1173
    move-object/from16 v2, p2

    .line 1174
    .line 1175
    move v5, v8

    .line 1176
    move/from16 v7, v18

    .line 1177
    .line 1178
    const/4 v8, 0x3

    .line 1179
    const/4 v9, 0x5

    .line 1180
    goto/16 :goto_3

    .line 1181
    .line 1182
    :cond_31
    :goto_23
    iget v0, v4, Ldi;->a:I

    .line 1183
    .line 1184
    or-int v0, p3, v0

    .line 1185
    .line 1186
    new-instance v1, Lh73;

    .line 1187
    .line 1188
    invoke-virtual {v10}, Lf73;->b()Lg73;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v2

    .line 1192
    invoke-direct {v1, v2, v0}, Lh73;-><init>(Lg73;I)V

    .line 1193
    .line 1194
    .line 1195
    return-object v1

    .line 1196
    :cond_32
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1197
    .line 1198
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v1

    .line 1202
    const-string v2, "<VectorGraphic> tag requires viewportHeight > 0"

    .line 1203
    .line 1204
    invoke-static {v1, v2}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1209
    .line 1210
    .line 1211
    throw v0

    .line 1212
    :cond_33
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1213
    .line 1214
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    const-string v2, "<VectorGraphic> tag requires viewportWidth > 0"

    .line 1219
    .line 1220
    invoke-static {v1, v2}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v1

    .line 1224
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    throw v0

    .line 1228
    nop

    .line 1229
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v0, "r"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    move-object v2, v0

    .line 57
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_2
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    :try_start_6
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 67
    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_3
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 77
    :catch_0
    :cond_1
    return-object v1
.end method

.method public static final l(Loi5;Ls92;Lgn2;)Ll79;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "not a zip: size="

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ls92;->openReadOnly(Loi5;)Lg92;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    :try_start_0
    invoke-virtual {v3}, Lg92;->size()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    const-wide/16 v6, 0x16

    .line 19
    .line 20
    sub-long v6, v4, v6

    .line 21
    .line 22
    const-wide/16 v8, 0x0

    .line 23
    .line 24
    cmp-long v10, v6, v8

    .line 25
    .line 26
    if-ltz v10, :cond_e

    .line 27
    .line 28
    const-wide/32 v10, 0x10016

    .line 29
    .line 30
    .line 31
    sub-long/2addr v4, v10

    .line 32
    invoke-static {v4, v5, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    :goto_0
    invoke-virtual {v3, v6, v7}, Lg92;->p(J)Lf92;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v10, Lj76;

    .line 41
    .line 42
    invoke-direct {v10, v0}, Lj76;-><init>(Lje7;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 43
    .line 44
    .line 45
    :try_start_1
    invoke-virtual {v10}, Lj76;->k()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const v11, 0x6054b50

    .line 50
    .line 51
    .line 52
    if-ne v0, v11, :cond_c

    .line 53
    .line 54
    invoke-virtual {v10}, Lj76;->p()S

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const v4, 0xffff

    .line 59
    .line 60
    .line 61
    and-int/2addr v0, v4

    .line 62
    invoke-virtual {v10}, Lj76;->p()S

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    and-int/2addr v5, v4

    .line 67
    invoke-virtual {v10}, Lj76;->p()S

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    and-int/2addr v11, v4

    .line 72
    int-to-long v14, v11

    .line 73
    invoke-virtual {v10}, Lj76;->p()S

    .line 74
    .line 75
    .line 76
    move-result v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    .line 77
    and-int/2addr v11, v4

    .line 78
    int-to-long v11, v11

    .line 79
    cmp-long v11, v14, v11

    .line 80
    .line 81
    const-string v12, "unsupported zip: spanned"

    .line 82
    .line 83
    if-nez v11, :cond_b

    .line 84
    .line 85
    if-nez v0, :cond_b

    .line 86
    .line 87
    if-nez v5, :cond_b

    .line 88
    .line 89
    move v0, v4

    .line 90
    const-wide/16 v4, 0x4

    .line 91
    .line 92
    :try_start_2
    invoke-virtual {v10, v4, v5}, Lj76;->skip(J)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Lj76;->k()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    int-to-long v4, v4

    .line 100
    const-wide v16, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long v16, v4, v16

    .line 106
    .line 107
    invoke-virtual {v10}, Lj76;->p()S

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    and-int v13, v4, v0

    .line 112
    .line 113
    move-object v0, v12

    .line 114
    new-instance v12, Ly22;

    .line 115
    .line 116
    invoke-direct/range {v12 .. v17}, Ly22;-><init>(IJJ)V

    .line 117
    .line 118
    .line 119
    int-to-long v4, v13

    .line 120
    invoke-virtual {v10, v4, v5}, Lj76;->o(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_c

    .line 121
    .line 122
    .line 123
    :try_start_3
    invoke-virtual {v10}, Lj76;->close()V

    .line 124
    .line 125
    .line 126
    const-wide/16 v4, 0x14

    .line 127
    .line 128
    sub-long/2addr v6, v4

    .line 129
    cmp-long v4, v6, v8

    .line 130
    .line 131
    if-lez v4, :cond_6

    .line 132
    .line 133
    invoke-virtual {v3, v6, v7}, Lg92;->p(J)Lf92;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    new-instance v6, Lj76;

    .line 138
    .line 139
    invoke-direct {v6, v4}, Lj76;-><init>(Lje7;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 140
    .line 141
    .line 142
    :try_start_4
    invoke-virtual {v6}, Lj76;->k()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    const v7, 0x7064b50

    .line 147
    .line 148
    .line 149
    if-ne v4, v7, :cond_4

    .line 150
    .line 151
    invoke-virtual {v6}, Lj76;->k()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    invoke-virtual {v6}, Lj76;->m()J

    .line 156
    .line 157
    .line 158
    move-result-wide v10

    .line 159
    invoke-virtual {v6}, Lj76;->k()I

    .line 160
    .line 161
    .line 162
    move-result v7

    .line 163
    const/4 v14, 0x1

    .line 164
    if-ne v7, v14, :cond_3

    .line 165
    .line 166
    if-nez v4, :cond_3

    .line 167
    .line 168
    invoke-virtual {v3, v10, v11}, Lg92;->p(J)Lf92;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    new-instance v7, Lj76;

    .line 173
    .line 174
    invoke-direct {v7, v4}, Lj76;-><init>(Lje7;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 175
    .line 176
    .line 177
    :try_start_5
    invoke-virtual {v7}, Lj76;->k()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    const v10, 0x6064b50

    .line 182
    .line 183
    .line 184
    if-ne v4, v10, :cond_1

    .line 185
    .line 186
    const-wide/16 v10, 0xc

    .line 187
    .line 188
    invoke-virtual {v7, v10, v11}, Lj76;->skip(J)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7}, Lj76;->k()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    invoke-virtual {v7}, Lj76;->k()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    invoke-virtual {v7}, Lj76;->m()J

    .line 200
    .line 201
    .line 202
    move-result-wide v20

    .line 203
    invoke-virtual {v7}, Lj76;->m()J

    .line 204
    .line 205
    .line 206
    move-result-wide v14

    .line 207
    cmp-long v11, v20, v14

    .line 208
    .line 209
    if-nez v11, :cond_0

    .line 210
    .line 211
    if-nez v4, :cond_0

    .line 212
    .line 213
    if-nez v10, :cond_0

    .line 214
    .line 215
    const-wide/16 v10, 0x8

    .line 216
    .line 217
    invoke-virtual {v7, v10, v11}, Lj76;->skip(J)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7}, Lj76;->m()J

    .line 221
    .line 222
    .line 223
    move-result-wide v22

    .line 224
    new-instance v18, Ly22;

    .line 225
    .line 226
    move/from16 v19, v13

    .line 227
    .line 228
    invoke-direct/range {v18 .. v23}, Ly22;-><init>(IJJ)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 229
    .line 230
    .line 231
    :try_start_6
    invoke-virtual {v7}, Lj76;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 232
    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    goto :goto_1

    .line 236
    :catchall_0
    move-exception v0

    .line 237
    :goto_1
    move-object/from16 v12, v18

    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_0
    :try_start_7
    new-instance v4, Ljava/io/IOException;

    .line 241
    .line 242
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v4

    .line 246
    :goto_2
    move-object v4, v0

    .line 247
    goto :goto_3

    .line 248
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 249
    .line 250
    new-instance v11, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v13, "bad zip: expected "

    .line 256
    .line 257
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-static {v10}, Lu28;->g(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v10, " but was "

    .line 268
    .line 269
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-static {v4}, Lu28;->g(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 287
    :catchall_1
    move-exception v0

    .line 288
    goto :goto_2

    .line 289
    :goto_3
    :try_start_8
    invoke-virtual {v7}, Lj76;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :catchall_2
    move-exception v0

    .line 294
    :try_start_9
    invoke-static {v4, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    :goto_4
    move-object v0, v4

    .line 298
    :goto_5
    if-nez v0, :cond_2

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_2
    throw v0

    .line 302
    :catchall_3
    move-exception v0

    .line 303
    move-object v4, v0

    .line 304
    goto :goto_7

    .line 305
    :cond_3
    new-instance v4, Ljava/io/IOException;

    .line 306
    .line 307
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 311
    :cond_4
    :goto_6
    :try_start_a
    invoke-virtual {v6}, Lj76;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 312
    .line 313
    .line 314
    const/4 v0, 0x0

    .line 315
    goto :goto_9

    .line 316
    :catchall_4
    move-exception v0

    .line 317
    goto :goto_9

    .line 318
    :goto_7
    :try_start_b
    invoke-virtual {v6}, Lj76;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 319
    .line 320
    .line 321
    goto :goto_8

    .line 322
    :catchall_5
    move-exception v0

    .line 323
    :try_start_c
    invoke-static {v4, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :goto_8
    move-object v0, v4

    .line 327
    :goto_9
    if-nez v0, :cond_5

    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_5
    throw v0

    .line 331
    :catchall_6
    move-exception v0

    .line 332
    move-object v1, v0

    .line 333
    goto/16 :goto_11

    .line 334
    .line 335
    :cond_6
    :goto_a
    new-instance v4, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 338
    .line 339
    .line 340
    iget-wide v6, v12, Ly22;->b:J

    .line 341
    .line 342
    invoke-virtual {v3, v6, v7}, Lg92;->p(J)Lf92;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    new-instance v6, Lj76;

    .line 347
    .line 348
    invoke-direct {v6, v0}, Lj76;-><init>(Lje7;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 349
    .line 350
    .line 351
    :try_start_d
    iget-wide v10, v12, Ly22;->a:J

    .line 352
    .line 353
    :goto_b
    cmp-long v0, v8, v10

    .line 354
    .line 355
    if-gez v0, :cond_9

    .line 356
    .line 357
    invoke-static {v6}, Lu28;->m(Lj76;)Lk79;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-wide v13, v0, Lk79;->h:J
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 362
    .line 363
    move-object v15, v6

    .line 364
    :try_start_e
    iget-wide v5, v12, Ly22;->b:J

    .line 365
    .line 366
    cmp-long v5, v13, v5

    .line 367
    .line 368
    if-gez v5, :cond_8

    .line 369
    .line 370
    move-object/from16 v13, p2

    .line 371
    .line 372
    invoke-interface {v13, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    check-cast v5, Ljava/lang/Boolean;

    .line 377
    .line 378
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-eqz v5, :cond_7

    .line 383
    .line 384
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    goto :goto_d

    .line 388
    :catchall_7
    move-exception v0

    .line 389
    :goto_c
    move-object v5, v0

    .line 390
    goto :goto_e

    .line 391
    :cond_7
    :goto_d
    const-wide/16 v5, 0x1

    .line 392
    .line 393
    add-long/2addr v8, v5

    .line 394
    move-object v6, v15

    .line 395
    goto :goto_b

    .line 396
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 397
    .line 398
    const-string v5, "bad zip: local file header offset >= central directory offset"

    .line 399
    .line 400
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 404
    :catchall_8
    move-exception v0

    .line 405
    move-object v15, v6

    .line 406
    goto :goto_c

    .line 407
    :cond_9
    move-object v15, v6

    .line 408
    :try_start_f
    invoke-virtual {v15}, Lj76;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 409
    .line 410
    .line 411
    const/4 v5, 0x0

    .line 412
    goto :goto_f

    .line 413
    :catchall_9
    move-exception v0

    .line 414
    move-object v5, v0

    .line 415
    goto :goto_f

    .line 416
    :goto_e
    :try_start_10
    invoke-virtual {v15}, Lj76;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 417
    .line 418
    .line 419
    goto :goto_f

    .line 420
    :catchall_a
    move-exception v0

    .line 421
    :try_start_11
    invoke-static {v5, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    :goto_f
    if-nez v5, :cond_a

    .line 425
    .line 426
    invoke-static {v4}, Lu28;->a(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    new-instance v4, Ll79;

    .line 431
    .line 432
    invoke-direct {v4, v1, v2, v0}, Ll79;-><init>(Loi5;Ls92;Ljava/util/LinkedHashMap;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 433
    .line 434
    .line 435
    :try_start_12
    invoke-virtual {v3}, Lg92;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    .line 436
    .line 437
    .line 438
    :catchall_b
    return-object v4

    .line 439
    :cond_a
    :try_start_13
    throw v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 440
    :catchall_c
    move-exception v0

    .line 441
    goto :goto_10

    .line 442
    :cond_b
    move-object v0, v12

    .line 443
    :try_start_14
    new-instance v1, Ljava/io/IOException;

    .line 444
    .line 445
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    .line 449
    :cond_c
    move-object/from16 v13, p2

    .line 450
    .line 451
    :try_start_15
    invoke-virtual {v10}, Lj76;->close()V

    .line 452
    .line 453
    .line 454
    const-wide/16 v10, -0x1

    .line 455
    .line 456
    add-long/2addr v6, v10

    .line 457
    cmp-long v0, v6, v4

    .line 458
    .line 459
    if-ltz v0, :cond_d

    .line 460
    .line 461
    goto/16 :goto_0

    .line 462
    .line 463
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 464
    .line 465
    const-string v1, "not a zip: end of central directory signature not found"

    .line 466
    .line 467
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v0

    .line 471
    :goto_10
    invoke-virtual {v10}, Lj76;->close()V

    .line 472
    .line 473
    .line 474
    throw v0

    .line 475
    :cond_e
    new-instance v1, Ljava/io/IOException;

    .line 476
    .line 477
    new-instance v2, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v3}, Lg92;->size()J

    .line 483
    .line 484
    .line 485
    move-result-wide v4

    .line 486
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 497
    :goto_11
    if-eqz v3, :cond_f

    .line 498
    .line 499
    :try_start_16
    invoke-virtual {v3}, Lg92;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    .line 500
    .line 501
    .line 502
    goto :goto_12

    .line 503
    :catchall_d
    move-exception v0

    .line 504
    invoke-static {v1, v0}, Lgv3;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 505
    .line 506
    .line 507
    :cond_f
    :goto_12
    throw v1
.end method

.method public static final m(Lj76;)Lk79;
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-virtual {v5}, Lj76;->k()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0x2014b50

    .line 8
    .line 9
    .line 10
    if-ne v0, v1, :cond_7

    .line 11
    .line 12
    const-wide/16 v0, 0x4

    .line 13
    .line 14
    invoke-virtual {v5, v0, v1}, Lj76;->skip(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v5}, Lj76;->p()S

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, 0xffff

    .line 22
    .line 23
    .line 24
    and-int v2, v0, v1

    .line 25
    .line 26
    and-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    if-nez v0, :cond_6

    .line 30
    .line 31
    invoke-virtual {v5}, Lj76;->p()S

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    and-int v22, v0, v1

    .line 36
    .line 37
    invoke-virtual {v5}, Lj76;->p()S

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    and-int v26, v0, v1

    .line 42
    .line 43
    invoke-virtual {v5}, Lj76;->p()S

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    and-int v25, v0, v1

    .line 48
    .line 49
    invoke-virtual {v5}, Lj76;->k()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    int-to-long v2, v0

    .line 54
    const-wide v6, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long v16, v2, v6

    .line 60
    .line 61
    move-wide v2, v6

    .line 62
    new-instance v6, Lda6;

    .line 63
    .line 64
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5}, Lj76;->k()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v7, v0

    .line 72
    and-long/2addr v7, v2

    .line 73
    iput-wide v7, v6, Lda6;->X:J

    .line 74
    .line 75
    new-instance v4, Lda6;

    .line 76
    .line 77
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lj76;->k()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    int-to-long v7, v0

    .line 85
    and-long/2addr v7, v2

    .line 86
    iput-wide v7, v4, Lda6;->X:J

    .line 87
    .line 88
    invoke-virtual {v5}, Lj76;->p()S

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    and-int/2addr v0, v1

    .line 93
    invoke-virtual {v5}, Lj76;->p()S

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    and-int v12, v7, v1

    .line 98
    .line 99
    invoke-virtual {v5}, Lj76;->p()S

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    and-int v13, v7, v1

    .line 104
    .line 105
    const-wide/16 v7, 0x8

    .line 106
    .line 107
    invoke-virtual {v5, v7, v8}, Lj76;->skip(J)V

    .line 108
    .line 109
    .line 110
    move-wide v8, v7

    .line 111
    new-instance v7, Lda6;

    .line 112
    .line 113
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, Lj76;->k()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    int-to-long v14, v1

    .line 121
    and-long/2addr v14, v2

    .line 122
    iput-wide v14, v7, Lda6;->X:J

    .line 123
    .line 124
    int-to-long v0, v0

    .line 125
    invoke-virtual {v5, v0, v1}, Lj76;->o(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    const/4 v15, 0x0

    .line 130
    invoke-static {v14, v15}, Lfm7;->e0(Ljava/lang/CharSequence;C)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    iget-wide v0, v4, Lda6;->X:J

    .line 137
    .line 138
    cmp-long v0, v0, v2

    .line 139
    .line 140
    const-wide/16 v18, 0x0

    .line 141
    .line 142
    if-nez v0, :cond_0

    .line 143
    .line 144
    move-wide v0, v8

    .line 145
    :goto_0
    move-wide/from16 v20, v2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_0
    move-wide/from16 v0, v18

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :goto_1
    iget-wide v2, v6, Lda6;->X:J

    .line 152
    .line 153
    cmp-long v2, v2, v20

    .line 154
    .line 155
    if-nez v2, :cond_1

    .line 156
    .line 157
    add-long/2addr v0, v8

    .line 158
    :cond_1
    iget-wide v2, v7, Lda6;->X:J

    .line 159
    .line 160
    cmp-long v2, v2, v20

    .line 161
    .line 162
    if-nez v2, :cond_2

    .line 163
    .line 164
    add-long/2addr v0, v8

    .line 165
    :cond_2
    move-wide v2, v0

    .line 166
    new-instance v8, Lea6;

    .line 167
    .line 168
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 169
    .line 170
    .line 171
    new-instance v9, Lea6;

    .line 172
    .line 173
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance v10, Lea6;

    .line 177
    .line 178
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    new-instance v1, Laa6;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    new-instance v0, Ln79;

    .line 187
    .line 188
    invoke-direct/range {v0 .. v10}, Ln79;-><init>(Laa6;JLda6;Lj76;Lda6;Lda6;Lea6;Lea6;Lea6;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v5, v12, v0}, Lu28;->n(Lj76;ILrn2;)V

    .line 192
    .line 193
    .line 194
    cmp-long v0, v2, v18

    .line 195
    .line 196
    if-lez v0, :cond_4

    .line 197
    .line 198
    iget-boolean v0, v1, Laa6;->X:Z

    .line 199
    .line 200
    if-eqz v0, :cond_3

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    const-string v0, "bad zip: zip64 extra required but absent"

    .line 204
    .line 205
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-object v11

    .line 209
    :cond_4
    :goto_2
    int-to-long v0, v13

    .line 210
    invoke-virtual {v5, v0, v1}, Lj76;->o(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v1, Loi5;->Y:Ljava/lang/String;

    .line 215
    .line 216
    const-string v1, "/"

    .line 217
    .line 218
    invoke-static {v1}, Lg55;->r(Ljava/lang/String;)Loi5;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2, v14}, Loi5;->f(Ljava/lang/String;)Loi5;

    .line 223
    .line 224
    .line 225
    move-result-object v13

    .line 226
    invoke-static {v14, v15, v1}, Lmm7;->R(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    new-instance v12, Lk79;

    .line 231
    .line 232
    iget-wide v1, v6, Lda6;->X:J

    .line 233
    .line 234
    iget-wide v3, v4, Lda6;->X:J

    .line 235
    .line 236
    iget-wide v5, v7, Lda6;->X:J

    .line 237
    .line 238
    iget-object v7, v8, Lea6;->X:Ljava/lang/Object;

    .line 239
    .line 240
    move-object/from16 v27, v7

    .line 241
    .line 242
    check-cast v27, Ljava/lang/Long;

    .line 243
    .line 244
    iget-object v7, v9, Lea6;->X:Ljava/lang/Object;

    .line 245
    .line 246
    move-object/from16 v28, v7

    .line 247
    .line 248
    check-cast v28, Ljava/lang/Long;

    .line 249
    .line 250
    iget-object v7, v10, Lea6;->X:Ljava/lang/Object;

    .line 251
    .line 252
    move-object/from16 v29, v7

    .line 253
    .line 254
    check-cast v29, Ljava/lang/Long;

    .line 255
    .line 256
    const v30, 0xe000

    .line 257
    .line 258
    .line 259
    move-object v15, v0

    .line 260
    move-wide/from16 v18, v1

    .line 261
    .line 262
    move-wide/from16 v20, v3

    .line 263
    .line 264
    move-wide/from16 v23, v5

    .line 265
    .line 266
    invoke-direct/range {v12 .. v30}, Lk79;-><init>(Loi5;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 267
    .line 268
    .line 269
    return-object v12

    .line 270
    :cond_5
    const-string v0, "bad zip: filename contains 0x00"

    .line 271
    .line 272
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-object v11

    .line 276
    :cond_6
    invoke-static {v2}, Lu28;->g(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const-string v1, "unsupported zip: general purpose bit flag="

    .line 281
    .line 282
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-object v11

    .line 290
    :cond_7
    new-instance v2, Ljava/io/IOException;

    .line 291
    .line 292
    invoke-static {v1}, Lu28;->g(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-static {v0}, Lu28;->g(I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    new-instance v3, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v4, "bad zip: expected "

    .line 303
    .line 304
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v1, " but was "

    .line 311
    .line 312
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v2
.end method

.method public static final n(Lj76;ILrn2;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lj76;->Y:Li90;

    .line 2
    .line 3
    int-to-long v1, p1

    .line 4
    :goto_0
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmp-long p1, v1, v3

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    const-wide/16 v5, 0x4

    .line 11
    .line 12
    cmp-long p1, v1, v5

    .line 13
    .line 14
    if-ltz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0}, Lj76;->p()S

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const v7, 0xffff

    .line 21
    .line 22
    .line 23
    and-int/2addr p1, v7

    .line 24
    invoke-virtual {p0}, Lj76;->p()S

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    int-to-long v7, v7

    .line 29
    const-wide/32 v9, 0xffff

    .line 30
    .line 31
    .line 32
    and-long/2addr v7, v9

    .line 33
    sub-long/2addr v1, v5

    .line 34
    cmp-long v5, v1, v7

    .line 35
    .line 36
    if-ltz v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v7, v8}, Lj76;->T0(J)V

    .line 39
    .line 40
    .line 41
    iget-wide v5, v0, Li90;->Y:J

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    invoke-interface {p2, v9, v10}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    iget-wide v9, v0, Li90;->Y:J

    .line 55
    .line 56
    add-long/2addr v9, v7

    .line 57
    sub-long/2addr v9, v5

    .line 58
    cmp-long v3, v9, v3

    .line 59
    .line 60
    if-ltz v3, :cond_1

    .line 61
    .line 62
    if-lez v3, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0, v9, v10}, Li90;->skip(J)V

    .line 65
    .line 66
    .line 67
    :cond_0
    sub-long/2addr v1, v7

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const-string p0, "unsupported zip: too many bytes processed for "

    .line 70
    .line 71
    invoke-static {p1, p0}, Lpc6;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    const-string p0, "bad zip: truncated value in extra field"

    .line 80
    .line 81
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    const-string p0, "bad zip: truncated header in extra field"

    .line 86
    .line 87
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    return-void
.end method

.method public static final o(Lj76;Lk79;)Lk79;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lj76;->k()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const v3, 0x4034b50

    .line 10
    .line 11
    .line 12
    if-ne v2, v3, :cond_2

    .line 13
    .line 14
    const-wide/16 v2, 0x2

    .line 15
    .line 16
    invoke-virtual {v0, v2, v3}, Lj76;->skip(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lj76;->p()S

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const v3, 0xffff

    .line 24
    .line 25
    .line 26
    and-int v4, v2, v3

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    const-wide/16 v6, 0x12

    .line 34
    .line 35
    invoke-virtual {v0, v6, v7}, Lj76;->skip(J)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lj76;->p()S

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    int-to-long v6, v2

    .line 43
    const-wide/32 v8, 0xffff

    .line 44
    .line 45
    .line 46
    and-long/2addr v6, v8

    .line 47
    invoke-virtual {v0}, Lj76;->p()S

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    and-int/2addr v2, v3

    .line 52
    invoke-virtual {v0, v6, v7}, Lj76;->skip(J)V

    .line 53
    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    int-to-long v1, v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lj76;->skip(J)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :cond_0
    new-instance v3, Lea6;

    .line 63
    .line 64
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lea6;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v5, Lea6;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v6, Lm79;

    .line 78
    .line 79
    invoke-direct {v6, v0, v3, v4, v5}, Lm79;-><init>(Lj76;Lea6;Lea6;Lea6;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v2, v6}, Lu28;->n(Lj76;ILrn2;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v3, Lea6;->X:Ljava/lang/Object;

    .line 86
    .line 87
    move-object/from16 v24, v0

    .line 88
    .line 89
    check-cast v24, Ljava/lang/Integer;

    .line 90
    .line 91
    iget-object v0, v4, Lea6;->X:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v25, v0

    .line 94
    .line 95
    check-cast v25, Ljava/lang/Integer;

    .line 96
    .line 97
    iget-object v0, v5, Lea6;->X:Ljava/lang/Object;

    .line 98
    .line 99
    move-object/from16 v26, v0

    .line 100
    .line 101
    check-cast v26, Ljava/lang/Integer;

    .line 102
    .line 103
    new-instance v6, Lk79;

    .line 104
    .line 105
    iget-object v7, v1, Lk79;->a:Loi5;

    .line 106
    .line 107
    iget-boolean v8, v1, Lk79;->b:Z

    .line 108
    .line 109
    iget-object v9, v1, Lk79;->c:Ljava/lang/String;

    .line 110
    .line 111
    iget-wide v10, v1, Lk79;->d:J

    .line 112
    .line 113
    iget-wide v12, v1, Lk79;->e:J

    .line 114
    .line 115
    iget-wide v14, v1, Lk79;->f:J

    .line 116
    .line 117
    iget v0, v1, Lk79;->g:I

    .line 118
    .line 119
    iget-wide v2, v1, Lk79;->h:J

    .line 120
    .line 121
    iget v4, v1, Lk79;->i:I

    .line 122
    .line 123
    iget v5, v1, Lk79;->j:I

    .line 124
    .line 125
    move/from16 v16, v0

    .line 126
    .line 127
    iget-object v0, v1, Lk79;->k:Ljava/lang/Long;

    .line 128
    .line 129
    move-object/from16 v21, v0

    .line 130
    .line 131
    iget-object v0, v1, Lk79;->l:Ljava/lang/Long;

    .line 132
    .line 133
    iget-object v1, v1, Lk79;->m:Ljava/lang/Long;

    .line 134
    .line 135
    move-object/from16 v22, v0

    .line 136
    .line 137
    move-object/from16 v23, v1

    .line 138
    .line 139
    move-wide/from16 v17, v2

    .line 140
    .line 141
    move/from16 v19, v4

    .line 142
    .line 143
    move/from16 v20, v5

    .line 144
    .line 145
    invoke-direct/range {v6 .. v26}, Lk79;-><init>(Loi5;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 146
    .line 147
    .line 148
    return-object v6

    .line 149
    :cond_1
    invoke-static {v4}, Lu28;->g(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const-string v1, "unsupported zip: general purpose bit flag="

    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, Lu52;->s(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v5

    .line 163
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 164
    .line 165
    invoke-static {v3}, Lu28;->g(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v2}, Lu28;->g(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    new-instance v3, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v4, "bad zip: expected "

    .line 176
    .line 177
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, " but was "

    .line 184
    .line 185
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
.end method

.method public static final p(ILlp2;)Lg73;
    .locals 6

    .line 1
    sget-object v0, Lpc;->b:Lox1;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    sget-object v1, Lpc;->c:Lz01;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/res/Resources;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, p0}, Llp2;->d(I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p1, v1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    or-int/2addr v3, v4

    .line 34
    invoke-virtual {p1, v0}, Llp2;->f(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    or-int/2addr v3, v4

    .line 39
    invoke-virtual {p1, v2}, Llp2;->f(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    or-int/2addr v2, v3

    .line 44
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    sget-object v2, Lzz0;->a:Lbe;

    .line 51
    .line 52
    if-ne v3, v2, :cond_2

    .line 53
    .line 54
    :cond_0
    new-instance v2, Landroid/util/TypedValue;

    .line 55
    .line 56
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-virtual {v1, p0, v2, v3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    :goto_0
    const/4 v5, 0x2

    .line 72
    if-eq v4, v5, :cond_1

    .line 73
    .line 74
    if-eq v4, v3, :cond_1

    .line 75
    .line 76
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    if-ne v4, v5, :cond_3

    .line 82
    .line 83
    iget v2, v2, Landroid/util/TypedValue;->changingConfigurations:I

    .line 84
    .line 85
    invoke-static {v0, v1, p0, v2}, Lu28;->j(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lh73;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object v3, p0, Lh73;->a:Lg73;

    .line 90
    .line 91
    invoke-virtual {p1, v3}, Llp2;->g0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    check-cast v3, Lg73;

    .line 95
    .line 96
    return-object v3

    .line 97
    :cond_3
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 98
    .line 99
    const-string p1, "No start tag found"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0
.end method
