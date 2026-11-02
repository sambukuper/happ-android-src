.class public final Lio/sentry/s3;
.super Lio/sentry/c0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final i:Ljava/nio/charset/Charset;


# instance fields
.field public final e:Lio/sentry/i1;

.field public final f:Lio/sentry/z0;

.field public final g:Lio/sentry/o1;

.field public final h:Lio/sentry/ILogger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lio/sentry/s3;->i:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lio/sentry/i1;Lio/sentry/z0;Lio/sentry/o1;Lio/sentry/ILogger;JI)V
    .locals 6

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p4

    .line 4
    move-wide v3, p5

    .line 5
    move v5, p7

    .line 6
    invoke-direct/range {v0 .. v5}, Lio/sentry/c0;-><init>(Lio/sentry/i1;Lio/sentry/ILogger;JI)V

    .line 7
    .line 8
    .line 9
    iput-object v1, v0, Lio/sentry/s3;->e:Lio/sentry/i1;

    .line 10
    .line 11
    const-string p0, "Envelope reader is required."

    .line 12
    .line 13
    invoke-static {p2, p0}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, v0, Lio/sentry/s3;->f:Lio/sentry/z0;

    .line 17
    .line 18
    const-string p0, "Serializer is required."

    .line 19
    .line 20
    invoke-static {p3, p0}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object p3, v0, Lio/sentry/s3;->g:Lio/sentry/o1;

    .line 24
    .line 25
    const-string p0, "Logger is required."

    .line 26
    .line 27
    invoke-static {v2, p0}, Lio/sentry/util/b;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, v0, Lio/sentry/s3;->h:Lio/sentry/ILogger;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p0, "session"

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const-string p0, "previous_session"

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const-string p0, "startup_crash"

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final b(Ljava/io/File;Lio/sentry/n0;)V
    .locals 7

    .line 1
    const-string v0, "sentry:typeCheckHint"

    .line 2
    .line 3
    const-class v1, Lio/sentry/hints/h;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p0, v2}, Lio/sentry/s3;->a(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Lio/sentry/s3;->h:Lio/sentry/ILogger;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    sget-object p0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "File \'%s\' should be ignored."

    .line 28
    .line 29
    invoke-interface {v3, p0, p2, p1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 34
    .line 35
    new-instance v4, Ljava/io/FileInputStream;

    .line 36
    .line 37
    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object v4, p0, Lio/sentry/s3;->f:Lio/sentry/z0;

    .line 44
    .line 45
    invoke-interface {v4, v2}, Lio/sentry/z0;->a(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    sget-object v4, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 52
    .line 53
    const-string v5, "Stream from path %s resulted in a null envelope."

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-interface {v3, v4, v5, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v4

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p0, v4, p2}, Lio/sentry/s3;->e(Lio/sentry/internal/debugmeta/c;Lio/sentry/n0;)V

    .line 70
    .line 71
    .line 72
    sget-object v4, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 73
    .line 74
    const-string v5, "File \'%s\' is done."

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-interface {v3, v4, v5, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    .line 86
    .line 87
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {p2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_2

    .line 103
    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    check-cast v2, Lio/sentry/hints/h;

    .line 107
    .line 108
    invoke-virtual {p0, p1, v2}, Lio/sentry/s3;->d(Ljava/io/File;Lio/sentry/hints/h;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_2
    invoke-static {v1, v2, v3}, Lio/sentry/util/b;->o(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :catchall_1
    move-exception v2

    .line 117
    goto :goto_5

    .line 118
    :catch_0
    move-exception v2

    .line 119
    goto :goto_3

    .line 120
    :goto_1
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_2
    move-exception v2

    .line 125
    :try_start_4
    invoke-virtual {v4, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    :goto_2
    throw v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 129
    :goto_3
    :try_start_5
    sget-object v4, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 130
    .line 131
    const-string v5, "Error processing envelope."

    .line 132
    .line 133
    invoke-interface {v3, v4, v5, v2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {p2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-eqz p2, :cond_3

    .line 149
    .line 150
    if-eqz v2, :cond_3

    .line 151
    .line 152
    check-cast v2, Lio/sentry/hints/h;

    .line 153
    .line 154
    invoke-virtual {p0, p1, v2}, Lio/sentry/s3;->d(Ljava/io/File;Lio/sentry/hints/h;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_3
    invoke-static {v1, v2, v3}, Lio/sentry/util/b;->o(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 159
    .line 160
    .line 161
    :goto_4
    return-void

    .line 162
    :goto_5
    invoke-virtual {p2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {p2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_4

    .line 175
    .line 176
    if-eqz v4, :cond_4

    .line 177
    .line 178
    check-cast v4, Lio/sentry/hints/h;

    .line 179
    .line 180
    invoke-virtual {p0, p1, v4}, Lio/sentry/s3;->d(Ljava/io/File;Lio/sentry/hints/h;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_4
    invoke-static {v1, v4, v3}, Lio/sentry/util/b;->o(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 185
    .line 186
    .line 187
    :goto_6
    throw v2
.end method

.method public final c(Lio/sentry/l7;)Lio/sentry/b4;
    .locals 5

    .line 1
    iget-object p0, p0, Lio/sentry/s3;->h:Lio/sentry/ILogger;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    iget-object v0, p1, Lio/sentry/l7;->i0:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v1, v2}, Lio/sentry/util/b;->n(Ljava/lang/Double;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_0

    .line 23
    .line 24
    sget-object p1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 25
    .line 26
    const-string v1, "Invalid sample rate parsed from TraceContext: %s"

    .line 27
    .line 28
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {p0, p1, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p1, p1, Lio/sentry/l7;->j0:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1, v2}, Lio/sentry/util/b;->n(Ljava/lang/Double;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    new-instance v2, Lio/sentry/b4;

    .line 55
    .line 56
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-direct {v2, v3, v1, p1}, Lio/sentry/b4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_1
    new-instance p1, Lio/sentry/b4;

    .line 63
    .line 64
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-direct {p1, v2, v1}, Lio/sentry/b4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lio/sentry/util/b;->b(Lio/sentry/b4;)Lio/sentry/b4;

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    return-object p0

    .line 74
    :catch_0
    sget-object p1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 75
    .line 76
    const-string v1, "Unable to parse sample rate from TraceContext: %s"

    .line 77
    .line 78
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {p0, p1, v1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_0
    new-instance p0, Lio/sentry/b4;

    .line 86
    .line 87
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, p1, v0}, Lio/sentry/b4;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;)V

    .line 91
    .line 92
    .line 93
    return-object p0
.end method

.method public final synthetic d(Ljava/io/File;Lio/sentry/hints/h;)V
    .locals 2

    .line 1
    const-string v0, "Failed to delete: %s"

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/s3;->h:Lio/sentry/ILogger;

    .line 4
    .line 5
    invoke-interface {p2}, Lio/sentry/hints/h;->a()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    sget-object p2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {p0, p2, v0, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    move-exception p2

    .line 32
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p0, v1, p2, v0, p1}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final e(Lio/sentry/internal/debugmeta/c;Lio/sentry/n0;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 8
    .line 9
    iget-object v4, v0, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Ljava/lang/Iterable;

    .line 12
    .line 13
    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Lio/sentry/c5;

    .line 17
    .line 18
    iget-object v6, v5, Lio/sentry/c5;->X:Lio/sentry/protocol/w;

    .line 19
    .line 20
    instance-of v0, v4, Ljava/util/Collection;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, v4

    .line 25
    check-cast v0, Ljava/util/Collection;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v8, 0x0

    .line 37
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_1

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v0, v8

    .line 50
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v8, v1, Lio/sentry/s3;->h:Lio/sentry/ILogger;

    .line 59
    .line 60
    const-string v9, "Processing Envelope with %d item(s)"

    .line 61
    .line 62
    invoke-interface {v8, v3, v9, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v0, 0x0

    .line 70
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_10

    .line 75
    .line 76
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Lio/sentry/h5;

    .line 81
    .line 82
    const/4 v9, 0x1

    .line 83
    add-int/lit8 v10, v0, 0x1

    .line 84
    .line 85
    iget-object v0, v4, Lio/sentry/h5;->a:Lio/sentry/i5;

    .line 86
    .line 87
    iget-object v11, v4, Lio/sentry/h5;->a:Lio/sentry/i5;

    .line 88
    .line 89
    iget-object v12, v0, Lio/sentry/i5;->g0:Lio/sentry/r5;

    .line 90
    .line 91
    sget-object v13, Lio/sentry/r5;->Event:Lio/sentry/r5;

    .line 92
    .line 93
    iget-object v0, v0, Lio/sentry/i5;->g0:Lio/sentry/r5;

    .line 94
    .line 95
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const-string v13, "Timed out waiting for event id submission: %s"

    .line 100
    .line 101
    const-string v14, "Item %d is being captured."

    .line 102
    .line 103
    const-string v15, "Item %d of has a different event id (%s) to the envelope header (%s)"

    .line 104
    .line 105
    const-string v7, "Item %d of type %s returned null by the parser."

    .line 106
    .line 107
    const-string v9, "Item failed to process."

    .line 108
    .line 109
    move/from16 v16, v0

    .line 110
    .line 111
    iget-object v0, v1, Lio/sentry/s3;->g:Lio/sentry/o1;

    .line 112
    .line 113
    move-object/from16 v17, v3

    .line 114
    .line 115
    sget-object v3, Lio/sentry/s3;->i:Ljava/nio/charset/Charset;

    .line 116
    .line 117
    move/from16 v18, v10

    .line 118
    .line 119
    iget-object v10, v1, Lio/sentry/s3;->e:Lio/sentry/i1;

    .line 120
    .line 121
    if-eqz v16, :cond_8

    .line 122
    .line 123
    :try_start_0
    new-instance v12, Ljava/io/BufferedReader;

    .line 124
    .line 125
    move-object/from16 v16, v4

    .line 126
    .line 127
    new-instance v4, Ljava/io/InputStreamReader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 128
    .line 129
    move-object/from16 v19, v9

    .line 130
    .line 131
    :try_start_1
    new-instance v9, Ljava/io/ByteArrayInputStream;

    .line 132
    .line 133
    move-object/from16 v20, v13

    .line 134
    .line 135
    invoke-virtual/range {v16 .. v16}, Lio/sentry/h5;->g()[B

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-direct {v9, v13}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 140
    .line 141
    .line 142
    invoke-direct {v4, v9, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v12, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    .line 148
    :try_start_2
    const-class v3, Lio/sentry/j5;

    .line 149
    .line 150
    invoke-interface {v0, v12, v3}, Lio/sentry/o1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lio/sentry/j5;

    .line 155
    .line 156
    if-nez v0, :cond_2

    .line 157
    .line 158
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 159
    .line 160
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    iget-object v4, v11, Lio/sentry/i5;->g0:Lio/sentry/r5;

    .line 165
    .line 166
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-interface {v8, v0, v7, v3}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :goto_3
    move-object v3, v0

    .line 176
    goto/16 :goto_7

    .line 177
    .line 178
    :cond_2
    iget-object v3, v0, Lio/sentry/y4;->Z:Lio/sentry/protocol/u;

    .line 179
    .line 180
    if-eqz v3, :cond_4

    .line 181
    .line 182
    iget-object v3, v3, Lio/sentry/protocol/u;->X:Ljava/lang/String;

    .line 183
    .line 184
    const-string v4, "sentry.javascript"

    .line 185
    .line 186
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-nez v4, :cond_3

    .line 191
    .line 192
    const-string v4, "sentry.dart"

    .line 193
    .line 194
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-nez v4, :cond_3

    .line 199
    .line 200
    const-string v4, "sentry.dotnet"

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_4

    .line 207
    .line 208
    :cond_3
    const-string v3, "sentry:isFromHybridSdk"

    .line 209
    .line 210
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {v2, v4, v3}, Lio/sentry/n0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :catchall_0
    move-exception v0

    .line 217
    goto :goto_3

    .line 218
    :cond_4
    :goto_4
    if-eqz v6, :cond_6

    .line 219
    .line 220
    iget-object v3, v0, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 221
    .line 222
    invoke-virtual {v6, v3}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-nez v3, :cond_6

    .line 227
    .line 228
    iget-object v0, v0, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 229
    .line 230
    sget-object v3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 231
    .line 232
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    iget-object v7, v5, Lio/sentry/c5;->X:Lio/sentry/protocol/w;

    .line 237
    .line 238
    filled-new-array {v4, v7, v0}, [Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-interface {v8, v3, v15, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    .line 244
    .line 245
    :try_start_3
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 246
    .line 247
    .line 248
    :cond_5
    :goto_5
    const/4 v4, 0x0

    .line 249
    goto/16 :goto_10

    .line 250
    .line 251
    :catchall_1
    move-exception v0

    .line 252
    goto :goto_9

    .line 253
    :cond_6
    :try_start_4
    invoke-interface {v10, v0, v2}, Lio/sentry/i1;->z(Lio/sentry/j5;Lio/sentry/n0;)Lio/sentry/protocol/w;

    .line 254
    .line 255
    .line 256
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 257
    .line 258
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-interface {v8, v3, v14, v4}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v2}, Lio/sentry/s3;->f(Lio/sentry/n0;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-nez v3, :cond_7

    .line 274
    .line 275
    iget-object v0, v0, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 276
    .line 277
    sget-object v3, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 278
    .line 279
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    move-object/from16 v4, v20

    .line 284
    .line 285
    invoke-interface {v8, v3, v4, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 286
    .line 287
    .line 288
    :try_start_5
    invoke-virtual {v12}, Ljava/io/Reader;->close()V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_11

    .line 292
    .line 293
    :cond_7
    :goto_6
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 294
    .line 295
    .line 296
    goto/16 :goto_f

    .line 297
    .line 298
    :goto_7
    :try_start_6
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 299
    .line 300
    .line 301
    goto :goto_8

    .line 302
    :catchall_2
    move-exception v0

    .line 303
    :try_start_7
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    :goto_8
    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 307
    :catchall_3
    move-exception v0

    .line 308
    move-object/from16 v19, v9

    .line 309
    .line 310
    :goto_9
    sget-object v3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 311
    .line 312
    move-object/from16 v9, v19

    .line 313
    .line 314
    invoke-interface {v8, v3, v9, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_f

    .line 318
    .line 319
    :cond_8
    move-object/from16 v16, v4

    .line 320
    .line 321
    move-object v4, v13

    .line 322
    sget-object v13, Lio/sentry/r5;->Transaction:Lio/sentry/r5;

    .line 323
    .line 324
    invoke-virtual {v13, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    if-eqz v13, :cond_d

    .line 329
    .line 330
    :try_start_8
    new-instance v12, Ljava/io/BufferedReader;

    .line 331
    .line 332
    new-instance v13, Ljava/io/InputStreamReader;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 333
    .line 334
    move-object/from16 v19, v9

    .line 335
    .line 336
    :try_start_9
    new-instance v9, Ljava/io/ByteArrayInputStream;

    .line 337
    .line 338
    move-object/from16 v20, v4

    .line 339
    .line 340
    invoke-virtual/range {v16 .. v16}, Lio/sentry/h5;->g()[B

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-direct {v9, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 345
    .line 346
    .line 347
    invoke-direct {v13, v9, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 348
    .line 349
    .line 350
    invoke-direct {v12, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 351
    .line 352
    .line 353
    :try_start_a
    const-class v3, Lio/sentry/protocol/f0;

    .line 354
    .line 355
    invoke-interface {v0, v12, v3}, Lio/sentry/o1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    check-cast v0, Lio/sentry/protocol/f0;

    .line 360
    .line 361
    if-nez v0, :cond_9

    .line 362
    .line 363
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 364
    .line 365
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    iget-object v4, v11, Lio/sentry/i5;->g0:Lio/sentry/r5;

    .line 370
    .line 371
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-interface {v8, v0, v7, v3}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    goto :goto_b

    .line 379
    :goto_a
    move-object v3, v0

    .line 380
    goto :goto_c

    .line 381
    :cond_9
    if-eqz v6, :cond_a

    .line 382
    .line 383
    iget-object v3, v0, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 384
    .line 385
    invoke-virtual {v6, v3}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-nez v3, :cond_a

    .line 390
    .line 391
    iget-object v0, v0, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 392
    .line 393
    sget-object v3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 394
    .line 395
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    iget-object v7, v5, Lio/sentry/c5;->X:Lio/sentry/protocol/w;

    .line 400
    .line 401
    filled-new-array {v4, v7, v0}, [Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-interface {v8, v3, v15, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 406
    .line 407
    .line 408
    :try_start_b
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 409
    .line 410
    .line 411
    goto/16 :goto_5

    .line 412
    .line 413
    :catchall_4
    move-exception v0

    .line 414
    goto :goto_e

    .line 415
    :catchall_5
    move-exception v0

    .line 416
    goto :goto_a

    .line 417
    :cond_a
    :try_start_c
    iget-object v3, v5, Lio/sentry/c5;->Z:Lio/sentry/l7;

    .line 418
    .line 419
    iget-object v4, v0, Lio/sentry/y4;->Y:Lio/sentry/protocol/e;

    .line 420
    .line 421
    invoke-virtual {v4}, Lio/sentry/protocol/e;->j()Lio/sentry/f7;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-eqz v4, :cond_b

    .line 426
    .line 427
    iget-object v4, v0, Lio/sentry/y4;->Y:Lio/sentry/protocol/e;

    .line 428
    .line 429
    invoke-virtual {v4}, Lio/sentry/protocol/e;->j()Lio/sentry/f7;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-virtual {v1, v3}, Lio/sentry/s3;->c(Lio/sentry/l7;)Lio/sentry/b4;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    invoke-virtual {v4, v7}, Lio/sentry/f7;->a(Lio/sentry/b4;)V

    .line 438
    .line 439
    .line 440
    :cond_b
    const/4 v4, 0x0

    .line 441
    invoke-interface {v10, v0, v3, v2, v4}, Lio/sentry/i1;->w(Lio/sentry/protocol/f0;Lio/sentry/l7;Lio/sentry/n0;Lio/sentry/z3;)Lio/sentry/protocol/w;

    .line 442
    .line 443
    .line 444
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 445
    .line 446
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-interface {v8, v3, v14, v4}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v2}, Lio/sentry/s3;->f(Lio/sentry/n0;)Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-nez v3, :cond_c

    .line 462
    .line 463
    iget-object v0, v0, Lio/sentry/y4;->X:Lio/sentry/protocol/w;

    .line 464
    .line 465
    sget-object v3, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 466
    .line 467
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    move-object/from16 v4, v20

    .line 472
    .line 473
    invoke-interface {v8, v3, v4, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 474
    .line 475
    .line 476
    :try_start_d
    invoke-virtual {v12}, Ljava/io/Reader;->close()V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_11

    .line 480
    .line 481
    :cond_c
    :goto_b
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 482
    .line 483
    .line 484
    goto :goto_f

    .line 485
    :goto_c
    :try_start_e
    invoke-virtual {v12}, Ljava/io/Reader;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 486
    .line 487
    .line 488
    goto :goto_d

    .line 489
    :catchall_6
    move-exception v0

    .line 490
    :try_start_f
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 491
    .line 492
    .line 493
    :goto_d
    throw v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 494
    :catchall_7
    move-exception v0

    .line 495
    move-object/from16 v19, v9

    .line 496
    .line 497
    :goto_e
    sget-object v3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 498
    .line 499
    move-object/from16 v9, v19

    .line 500
    .line 501
    invoke-interface {v8, v3, v9, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    goto :goto_f

    .line 505
    :cond_d
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    .line 506
    .line 507
    iget-object v3, v5, Lio/sentry/c5;->Y:Lio/sentry/protocol/u;

    .line 508
    .line 509
    move-object/from16 v4, v16

    .line 510
    .line 511
    invoke-direct {v0, v6, v3, v4}, Lio/sentry/internal/debugmeta/c;-><init>(Lio/sentry/protocol/w;Lio/sentry/protocol/u;Lio/sentry/h5;)V

    .line 512
    .line 513
    .line 514
    invoke-interface {v10, v0, v2}, Lio/sentry/i1;->g(Lio/sentry/internal/debugmeta/c;Lio/sentry/n0;)Lio/sentry/protocol/w;

    .line 515
    .line 516
    .line 517
    sget-object v0, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 518
    .line 519
    invoke-virtual {v12}, Lio/sentry/r5;->getItemType()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    const-string v4, "%s item %d is being captured."

    .line 532
    .line 533
    invoke-interface {v8, v0, v4, v3}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v1, v2}, Lio/sentry/s3;->f(Lio/sentry/n0;)Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-nez v0, :cond_e

    .line 541
    .line 542
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 543
    .line 544
    invoke-virtual {v12}, Lio/sentry/r5;->getItemType()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    const-string v2, "Timed out waiting for item type submission: %s"

    .line 553
    .line 554
    invoke-interface {v8, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    goto :goto_11

    .line 558
    :cond_e
    :goto_f
    const-string v0, "sentry:typeCheckHint"

    .line 559
    .line 560
    invoke-virtual {v2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    instance-of v4, v3, Lio/sentry/hints/k;

    .line 565
    .line 566
    if-eqz v4, :cond_f

    .line 567
    .line 568
    check-cast v3, Lio/sentry/hints/k;

    .line 569
    .line 570
    invoke-interface {v3}, Lio/sentry/hints/k;->e()Z

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    if-nez v3, :cond_f

    .line 575
    .line 576
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 577
    .line 578
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    const-string v2, "Envelope had a failed capture at item %d. No more items will be sent."

    .line 587
    .line 588
    invoke-interface {v8, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    goto :goto_11

    .line 592
    :cond_f
    invoke-virtual {v2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    invoke-virtual {v2, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    const-class v4, Lio/sentry/android/core/t0;

    .line 601
    .line 602
    invoke-virtual {v4, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-eqz v0, :cond_5

    .line 607
    .line 608
    if-eqz v3, :cond_5

    .line 609
    .line 610
    check-cast v3, Lio/sentry/android/core/t0;

    .line 611
    .line 612
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 613
    .line 614
    const/4 v4, 0x1

    .line 615
    invoke-direct {v0, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 616
    .line 617
    .line 618
    iput-object v0, v3, Lio/sentry/android/core/t0;->Z:Ljava/util/concurrent/CountDownLatch;

    .line 619
    .line 620
    const/4 v4, 0x0

    .line 621
    iput-boolean v4, v3, Lio/sentry/android/core/t0;->X:Z

    .line 622
    .line 623
    iput-boolean v4, v3, Lio/sentry/android/core/t0;->Y:Z

    .line 624
    .line 625
    :goto_10
    move-object/from16 v3, v17

    .line 626
    .line 627
    move/from16 v0, v18

    .line 628
    .line 629
    goto/16 :goto_2

    .line 630
    .line 631
    :cond_10
    :goto_11
    return-void
.end method

.method public final f(Lio/sentry/n0;)Z
    .locals 1

    .line 1
    const-string v0, "sentry:typeCheckHint"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lio/sentry/n0;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, Lio/sentry/hints/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Lio/sentry/hints/f;

    .line 12
    .line 13
    invoke-interface {p1}, Lio/sentry/hints/f;->d()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    const-class v0, Lio/sentry/hints/f;

    .line 19
    .line 20
    iget-object p0, p0, Lio/sentry/s3;->h:Lio/sentry/ILogger;

    .line 21
    .line 22
    invoke-static {v0, p1, p0}, Lio/sentry/util/b;->o(Ljava/lang/Class;Ljava/lang/Object;Lio/sentry/ILogger;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0
.end method
