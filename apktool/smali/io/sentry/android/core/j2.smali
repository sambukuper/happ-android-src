.class public final Lio/sentry/android/core/j2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/android/core/k0;


# instance fields
.field public final a:Lio/sentry/android/core/SentryAndroidOptions;

.field public final b:Lo8;

.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lio/sentry/android/core/j2;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 5
    .line 6
    new-instance v0, Lo8;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Lo8;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/sentry/android/core/j2;->b:Lo8;

    .line 12
    .line 13
    iput-object p1, p0, Lio/sentry/android/core/j2;->c:Landroid/content/Context;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/ApplicationExitInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getReason()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p1, 0x5

    .line 6
    if-ne p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final b()Ljava/lang/Long;
    .locals 2

    .line 1
    const-string v0, "last_tombstone_report"

    .line 2
    .line 3
    const-string v1, "Tombstone"

    .line 4
    .line 5
    iget-object p0, p0, Lio/sentry/android/core/j2;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lio/sentry/android/core/cache/b;->j(Lio/sentry/s6;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Tombstone"

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/android/core/j2;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalTombstones()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e(Landroid/app/ApplicationExitInfo;Z)Lio/sentry/n;
    .locals 14

    .line 1
    iget-object v1, p0, Lio/sentry/android/core/j2;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachRawTombstone()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 19
    .line 20
    const-string v4, "No tombstone InputStream available for ApplicationExitInfo from %s"

    .line 21
    .line 22
    sget-object v5, Lj$/time/format/DateTimeFormatter;->ISO_INSTANT:Lj$/time/format/DateTimeFormatter;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    invoke-static {v6, v7}, Lj$/time/Instant;->ofEpochMilli(J)Lj$/time/Instant;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v5, v6}, Lj$/time/format/DateTimeFormatter;->format(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {p0, v0, v4, v5}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p0, v0

    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    return-object v2

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    move-object p0, v0

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    if-eqz v0, :cond_2

    .line 59
    .line 60
    :try_start_3
    invoke-static {v3}, Lio/sentry/config/a;->r(Ljava/io/InputStream;)[B

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v4, v2

    .line 66
    :goto_0
    if-eqz v0, :cond_3

    .line 67
    .line 68
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 69
    .line 70
    invoke-direct {v0, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move-object v0, v3

    .line 75
    :goto_1
    new-instance v5, Lio/sentry/android/core/internal/tombstone/c;

    .line 76
    .line 77
    invoke-virtual {v1}, Lio/sentry/s6;->getInAppIncludes()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v1}, Lio/sentry/s6;->getInAppExcludes()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iget-object v8, p0, Lio/sentry/android/core/j2;->c:Landroid/content/Context;

    .line 86
    .line 87
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    iget-object v8, v8, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 92
    .line 93
    invoke-direct {v5, v0, v6, v7, v8}, Lio/sentry/android/core/internal/tombstone/c;-><init>(Ljava/io/InputStream;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 94
    .line 95
    .line 96
    :try_start_4
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/c;->g()Lio/sentry/j5;

    .line 97
    .line 98
    .line 99
    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 100
    :try_start_5
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/c;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 101
    .line 102
    .line 103
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    .line 107
    .line 108
    .line 109
    move-result-wide v11

    .line 110
    new-instance p1, Ljava/util/Date;

    .line 111
    .line 112
    invoke-direct {p1, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 113
    .line 114
    .line 115
    iput-object p1, v6, Lio/sentry/j5;->r0:Ljava/util/Date;

    .line 116
    .line 117
    new-instance v7, Lio/sentry/android/core/i2;

    .line 118
    .line 119
    invoke-virtual {v1}, Lio/sentry/s6;->getFlushTimeoutMillis()J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    move/from16 v13, p2

    .line 128
    .line 129
    invoke-direct/range {v7 .. v13}, Lio/sentry/android/core/i2;-><init>(JLio/sentry/ILogger;JZ)V

    .line 130
    .line 131
    .line 132
    invoke-static {v7}, Lio/sentry/util/b;->f(Ljava/lang/Object;)Lio/sentry/n0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-eqz v4, :cond_4

    .line 137
    .line 138
    new-instance v0, Lio/sentry/a;

    .line 139
    .line 140
    const-string v2, "tombstone.pb"

    .line 141
    .line 142
    const-string v3, "application/x-protobuf"

    .line 143
    .line 144
    invoke-direct {v0, v2, v3, v4}, Lio/sentry/a;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p1, Lio/sentry/n0;->g:Lio/sentry/a;

    .line 148
    .line 149
    :cond_4
    :try_start_7
    invoke-virtual {p0, v11, v12, v6, p1}, Lio/sentry/android/core/j2;->g(JLio/sentry/j5;Lio/sentry/n0;)Lio/sentry/j5;

    .line 150
    .line 151
    .line 152
    move-result-object p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 153
    if-eqz p0, :cond_5

    .line 154
    .line 155
    move-object v6, p0

    .line 156
    goto :goto_2

    .line 157
    :catchall_2
    move-exception v0

    .line 158
    move-object p0, v0

    .line 159
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    const-string v2, "Failed to merge native event with tombstone, continuing without merge: %s"

    .line 174
    .line 175
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_5
    :goto_2
    new-instance p0, Lio/sentry/n;

    .line 179
    .line 180
    const/4 v0, 0x1

    .line 181
    invoke-direct {p0, v6, p1, v7, v0}, Lio/sentry/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    return-object p0

    .line 185
    :catchall_3
    move-exception v0

    .line 186
    move-object p0, v0

    .line 187
    :try_start_8
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/c;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catchall_4
    move-exception v0

    .line 192
    :try_start_9
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    :goto_3
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 196
    :goto_4
    if-eqz v3, :cond_6

    .line 197
    .line 198
    :try_start_a
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :catchall_5
    move-exception v0

    .line 203
    :try_start_b
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    :cond_6
    :goto_5
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 207
    :goto_6
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 212
    .line 213
    sget-object v3, Lj$/time/format/DateTimeFormatter;->ISO_INSTANT:Lj$/time/format/DateTimeFormatter;

    .line 214
    .line 215
    invoke-virtual {p1}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    .line 216
    .line 217
    .line 218
    move-result-wide v4

    .line 219
    invoke-static {v4, v5}, Lj$/time/Instant;->ofEpochMilli(J)Lj$/time/Instant;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {v3, p1}, Lj$/time/format/DateTimeFormatter;->format(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    const-string p1, "Failed to parse tombstone from %s: %s"

    .line 236
    .line 237
    invoke-interface {v0, v1, p1, p0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-object v2
.end method

.method public final f(J)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "last_tombstone_report"

    .line 6
    .line 7
    const-string v0, "Tombstone"

    .line 8
    .line 9
    iget-object p0, p0, Lio/sentry/android/core/j2;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 10
    .line 11
    invoke-static {p0, p1, p2, v0}, Lio/sentry/android/core/cache/b;->l(Lio/sentry/s6;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final g(JLio/sentry/j5;Lio/sentry/n0;)Lio/sentry/j5;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    iget-object v3, v1, Lio/sentry/android/core/j2;->b:Lo8;

    .line 6
    .line 7
    iget-object v0, v3, Lo8;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v4, v0

    .line 10
    check-cast v4, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v0, v3, Lo8;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v5, v0

    .line 15
    check-cast v5, Lio/sentry/android/core/SentryAndroidOptions;

    .line 16
    .line 17
    iget-boolean v0, v3, Lo8;->Y:Z

    .line 18
    .line 19
    const/4 v7, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    :goto_0
    const/16 v16, 0x0

    .line 23
    .line 24
    goto/16 :goto_f

    .line 25
    .line 26
    :cond_0
    const/4 v8, 0x1

    .line 27
    iput-boolean v8, v3, Lo8;->Y:Z

    .line 28
    .line 29
    invoke-virtual {v5}, Lio/sentry/s6;->getOutboxPath()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 40
    .line 41
    const-string v8, "Outbox path is null, skipping native event collection."

    .line 42
    .line 43
    new-array v9, v7, [Ljava/lang/Object;

    .line 44
    .line 45
    invoke-interface {v0, v3, v8, v9}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v9, Ljava/io/File;

    .line 50
    .line 51
    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v9}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    if-nez v9, :cond_2

    .line 59
    .line 60
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    sget-object v8, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 65
    .line 66
    const-string v9, "Outbox path is not a directory or an I/O error occurred: %s"

    .line 67
    .line 68
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v3, v8, v9, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    array-length v0, v9

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 84
    .line 85
    const-string v8, "No envelope files found in outbox."

    .line 86
    .line 87
    new-array v9, v7, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-interface {v0, v3, v8, v9}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v10, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 98
    .line 99
    array-length v11, v9

    .line 100
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    const-string v12, "Scanning %d files in outbox for native events."

    .line 109
    .line 110
    invoke-interface {v0, v10, v12, v11}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    array-length v10, v9

    .line 114
    move v11, v7

    .line 115
    :goto_1
    if-ge v11, v10, :cond_15

    .line 116
    .line 117
    aget-object v12, v9, v11

    .line 118
    .line 119
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_13

    .line 124
    .line 125
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_13

    .line 130
    .line 131
    const-string v13, "session"

    .line 132
    .line 133
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 134
    .line 135
    .line 136
    move-result v13

    .line 137
    if-nez v13, :cond_13

    .line 138
    .line 139
    const-string v13, "previous_session"

    .line 140
    .line 141
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    if-nez v13, :cond_13

    .line 146
    .line 147
    const-string v13, "startup_crash"

    .line 148
    .line 149
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_13

    .line 154
    .line 155
    :try_start_0
    new-instance v13, Ljava/io/BufferedInputStream;

    .line 156
    .line 157
    new-instance v0, Ljava/io/FileInputStream;

    .line 158
    .line 159
    invoke-direct {v0, v12}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {v13, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 163
    .line 164
    .line 165
    move v0, v7

    .line 166
    :cond_4
    :try_start_1
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    .line 167
    .line 168
    .line 169
    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 170
    const/16 v15, 0xa

    .line 171
    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    const/4 v6, -0x1

    .line 175
    if-eq v14, v6, :cond_5

    .line 176
    .line 177
    add-int/lit8 v0, v0, 0x1

    .line 178
    .line 179
    if-ne v14, v15, :cond_4

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    if-lez v0, :cond_6

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    move v0, v6

    .line 186
    :goto_2
    if-gez v0, :cond_7

    .line 187
    .line 188
    :try_start_2
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 189
    .line 190
    .line 191
    move/from16 v18, v8

    .line 192
    .line 193
    move-object/from16 v17, v9

    .line 194
    .line 195
    :goto_3
    move-object/from16 v0, v16

    .line 196
    .line 197
    goto/16 :goto_d

    .line 198
    .line 199
    :catchall_0
    move-exception v0

    .line 200
    move/from16 v18, v8

    .line 201
    .line 202
    move-object/from16 v17, v9

    .line 203
    .line 204
    goto/16 :goto_c

    .line 205
    .line 206
    :cond_7
    move v14, v8

    .line 207
    move-object/from16 v17, v9

    .line 208
    .line 209
    int-to-long v8, v0

    .line 210
    :goto_4
    const-wide/32 v18, 0xc800000

    .line 211
    .line 212
    .line 213
    cmp-long v0, v8, v18

    .line 214
    .line 215
    if-gez v0, :cond_11

    .line 216
    .line 217
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 220
    .line 221
    .line 222
    move/from16 v18, v14

    .line 223
    .line 224
    :goto_5
    :try_start_4
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-eq v14, v6, :cond_9

    .line 229
    .line 230
    if-ne v14, v15, :cond_8

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    goto :goto_6

    .line 237
    :cond_8
    int-to-char v14, v14

    .line 238
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-lez v14, :cond_a

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    goto :goto_6

    .line 253
    :cond_a
    move-object/from16 v0, v16

    .line 254
    .line 255
    :goto_6
    if-eqz v0, :cond_12

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v14

    .line 261
    if-eqz v14, :cond_b

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    add-int/lit8 v14, v14, 0x1

    .line 269
    .line 270
    move-wide/from16 v20, v8

    .line 271
    .line 272
    int-to-long v7, v14

    .line 273
    add-long v8, v20, v7

    .line 274
    .line 275
    invoke-virtual {v3, v0}, Lo8;->m(Ljava/lang/String;)Lb8;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-nez v0, :cond_c

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_c
    iget v7, v0, Lb8;->b:I

    .line 283
    .line 284
    const-string v14, "event"

    .line 285
    .line 286
    iget-object v0, v0, Lb8;->c:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_e

    .line 295
    .line 296
    invoke-virtual {v3, v13, v7, v12}, Lo8;->i(Ljava/io/BufferedInputStream;ILjava/io/File;)Lio/sentry/android/core/c1;

    .line 297
    .line 298
    .line 299
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 300
    if-eqz v0, :cond_d

    .line 301
    .line 302
    :try_start_5
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 303
    .line 304
    .line 305
    goto :goto_d

    .line 306
    :catchall_1
    move-exception v0

    .line 307
    goto :goto_c

    .line 308
    :cond_d
    move-wide/from16 v20, v8

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :catchall_2
    move-exception v0

    .line 312
    :goto_7
    move-object v6, v0

    .line 313
    goto :goto_a

    .line 314
    :cond_e
    move-wide/from16 v20, v8

    .line 315
    .line 316
    int-to-long v8, v7

    .line 317
    :try_start_6
    invoke-static {v13, v8, v9}, Lo8;->o(Ljava/io/BufferedInputStream;J)V

    .line 318
    .line 319
    .line 320
    :goto_8
    int-to-long v7, v7

    .line 321
    add-long v8, v20, v7

    .line 322
    .line 323
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    .line 324
    .line 325
    .line 326
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 327
    if-ne v0, v6, :cond_f

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_f
    const-wide/16 v20, 0x1

    .line 331
    .line 332
    add-long v8, v8, v20

    .line 333
    .line 334
    if-eq v0, v15, :cond_10

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_10
    move/from16 v14, v18

    .line 338
    .line 339
    const/4 v7, 0x0

    .line 340
    goto/16 :goto_4

    .line 341
    .line 342
    :catchall_3
    move-exception v0

    .line 343
    move/from16 v18, v14

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_11
    move/from16 v18, v14

    .line 347
    .line 348
    :cond_12
    :goto_9
    :try_start_7
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 349
    .line 350
    .line 351
    goto/16 :goto_3

    .line 352
    .line 353
    :catchall_4
    move-exception v0

    .line 354
    move/from16 v18, v8

    .line 355
    .line 356
    move-object/from16 v17, v9

    .line 357
    .line 358
    const/16 v16, 0x0

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :goto_a
    :try_start_8
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :catchall_5
    move-exception v0

    .line 366
    :try_start_9
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    :goto_b
    throw v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 370
    :catchall_6
    move-exception v0

    .line 371
    move/from16 v18, v8

    .line 372
    .line 373
    move-object/from16 v17, v9

    .line 374
    .line 375
    const/16 v16, 0x0

    .line 376
    .line 377
    :goto_c
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    sget-object v7, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 382
    .line 383
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    const-string v9, "Error extracting metadata from envelope file: %s"

    .line 392
    .line 393
    invoke-interface {v6, v7, v0, v9, v8}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_3

    .line 397
    .line 398
    :goto_d
    if-eqz v0, :cond_14

    .line 399
    .line 400
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    sget-object v7, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 408
    .line 409
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v8

    .line 413
    iget-wide v12, v0, Lio/sentry/android/core/c1;->b:J

    .line 414
    .line 415
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    filled-new-array {v8, v0}, [Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    const-string v8, "Found native event in outbox: %s (timestamp: %d)"

    .line 424
    .line 425
    invoke-interface {v6, v7, v8, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    goto :goto_e

    .line 429
    :cond_13
    move/from16 v18, v8

    .line 430
    .line 431
    move-object/from16 v17, v9

    .line 432
    .line 433
    const/16 v16, 0x0

    .line 434
    .line 435
    :cond_14
    :goto_e
    add-int/lit8 v11, v11, 0x1

    .line 436
    .line 437
    move-object/from16 v9, v17

    .line 438
    .line 439
    move/from16 v8, v18

    .line 440
    .line 441
    const/4 v7, 0x0

    .line 442
    goto/16 :goto_1

    .line 443
    .line 444
    :cond_15
    const/16 v16, 0x0

    .line 445
    .line 446
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 451
    .line 452
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    const-string v7, "Collected %d native events from outbox."

    .line 465
    .line 466
    invoke-interface {v0, v3, v7, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    :goto_f
    invoke-virtual {v5}, Lio/sentry/android/core/SentryAndroidOptions;->getTombstoneMergeTimeThresholdMillis()J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-eqz v3, :cond_1b

    .line 482
    .line 483
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Lio/sentry/android/core/c1;

    .line 488
    .line 489
    iget-wide v8, v3, Lio/sentry/android/core/c1;->b:J

    .line 490
    .line 491
    sub-long v8, p1, v8

    .line 492
    .line 493
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    .line 494
    .line 495
    .line 496
    move-result-wide v8

    .line 497
    cmp-long v10, v8, v6

    .line 498
    .line 499
    if-gtz v10, :cond_16

    .line 500
    .line 501
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    sget-object v10, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 506
    .line 507
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 508
    .line 509
    .line 510
    move-result-object v8

    .line 511
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    filled-new-array {v8, v6}, [Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    const-string v7, "Matched native event by timestamp (diff: %d ms, threshold: %d ms)"

    .line 520
    .line 521
    invoke-interface {v0, v10, v7, v6}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    iget-object v3, v3, Lio/sentry/android/core/c1;->a:Ljava/io/File;

    .line 528
    .line 529
    :try_start_a
    new-instance v4, Ljava/io/BufferedInputStream;

    .line 530
    .line 531
    new-instance v0, Ljava/io/FileInputStream;

    .line 532
    .line 533
    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 534
    .line 535
    .line 536
    invoke-direct {v4, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 537
    .line 538
    .line 539
    :try_start_b
    invoke-virtual {v5}, Lio/sentry/s6;->getEnvelopeReader()Lio/sentry/z0;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-interface {v0, v4}, Lio/sentry/z0;->a(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    .line 544
    .line 545
    .line 546
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 547
    if-nez v0, :cond_18

    .line 548
    .line 549
    :cond_17
    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 550
    .line 551
    .line 552
    goto/16 :goto_16

    .line 553
    .line 554
    :catchall_7
    move-exception v0

    .line 555
    goto/16 :goto_15

    .line 556
    .line 557
    :cond_18
    :try_start_d
    iget-object v6, v0, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v6, Ljava/lang/Iterable;

    .line 560
    .line 561
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v7

    .line 569
    if-eqz v7, :cond_17

    .line 570
    .line 571
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    check-cast v7, Lio/sentry/h5;

    .line 576
    .line 577
    sget-object v8, Lio/sentry/r5;->Event:Lio/sentry/r5;

    .line 578
    .line 579
    iget-object v9, v7, Lio/sentry/h5;->a:Lio/sentry/i5;

    .line 580
    .line 581
    iget-object v9, v9, Lio/sentry/i5;->g0:Lio/sentry/r5;

    .line 582
    .line 583
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    if-nez v8, :cond_19

    .line 588
    .line 589
    goto :goto_10

    .line 590
    :cond_19
    new-instance v8, Ljava/io/BufferedReader;

    .line 591
    .line 592
    new-instance v9, Ljava/io/InputStreamReader;

    .line 593
    .line 594
    new-instance v10, Ljava/io/ByteArrayInputStream;

    .line 595
    .line 596
    invoke-virtual {v7}, Lio/sentry/h5;->g()[B

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    invoke-direct {v10, v7}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 601
    .line 602
    .line 603
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 604
    .line 605
    invoke-direct {v9, v10, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 606
    .line 607
    .line 608
    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 609
    .line 610
    .line 611
    :try_start_e
    invoke-virtual {v5}, Lio/sentry/s6;->getSerializer()Lio/sentry/o1;

    .line 612
    .line 613
    .line 614
    move-result-object v7

    .line 615
    const-class v9, Lio/sentry/j5;

    .line 616
    .line 617
    invoke-interface {v7, v8, v9}, Lio/sentry/o1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    check-cast v7, Lio/sentry/j5;

    .line 622
    .line 623
    if-eqz v7, :cond_1a

    .line 624
    .line 625
    const-string v9, "native"

    .line 626
    .line 627
    iget-object v10, v7, Lio/sentry/y4;->j0:Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v9

    .line 633
    if-eqz v9, :cond_1a

    .line 634
    .line 635
    new-instance v6, Lio/sentry/n;

    .line 636
    .line 637
    const/4 v9, 0x2

    .line 638
    invoke-direct {v6, v7, v3, v0, v9}, Lio/sentry/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 639
    .line 640
    .line 641
    :try_start_f
    invoke-virtual {v8}, Ljava/io/Reader;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 642
    .line 643
    .line 644
    :try_start_10
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 645
    .line 646
    .line 647
    goto :goto_17

    .line 648
    :catchall_8
    move-exception v0

    .line 649
    move-object v6, v0

    .line 650
    goto :goto_13

    .line 651
    :catchall_9
    move-exception v0

    .line 652
    move-object v6, v0

    .line 653
    goto :goto_11

    .line 654
    :cond_1a
    :try_start_11
    invoke-virtual {v8}, Ljava/io/Reader;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 655
    .line 656
    .line 657
    goto :goto_10

    .line 658
    :goto_11
    :try_start_12
    invoke-virtual {v8}, Ljava/io/Reader;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 659
    .line 660
    .line 661
    goto :goto_12

    .line 662
    :catchall_a
    move-exception v0

    .line 663
    :try_start_13
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    :goto_12
    throw v6
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 667
    :goto_13
    :try_start_14
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 668
    .line 669
    .line 670
    goto :goto_14

    .line 671
    :catchall_b
    move-exception v0

    .line 672
    :try_start_15
    invoke-virtual {v6, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 673
    .line 674
    .line 675
    :goto_14
    throw v6
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    .line 676
    :goto_15
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    sget-object v6, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 681
    .line 682
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    const-string v7, "Error loading envelope file: %s"

    .line 691
    .line 692
    invoke-interface {v4, v6, v0, v7, v3}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    goto :goto_16

    .line 696
    :cond_1b
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    sget-object v3, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 701
    .line 702
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 707
    .line 708
    .line 709
    move-result-object v6

    .line 710
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v4

    .line 714
    const-string v6, "No native event matched the tombstone timestamp %d within %d ms."

    .line 715
    .line 716
    invoke-interface {v0, v3, v6, v4}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    :goto_16
    move-object/from16 v6, v16

    .line 720
    .line 721
    :goto_17
    if-nez v6, :cond_1c

    .line 722
    .line 723
    goto/16 :goto_1b

    .line 724
    .line 725
    :cond_1c
    iget-object v0, v6, Lio/sentry/n;->c:Ljava/lang/Object;

    .line 726
    .line 727
    move-object v3, v0

    .line 728
    check-cast v3, Ljava/io/File;

    .line 729
    .line 730
    iget-object v1, v1, Lio/sentry/android/core/j2;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 731
    .line 732
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    sget-object v4, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 737
    .line 738
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v7

    .line 742
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v7

    .line 746
    const-string v8, "Found matching native event for tombstone, removing from outbox: %s"

    .line 747
    .line 748
    invoke-interface {v0, v4, v8, v7}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    :try_start_16
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-eqz v0, :cond_24

    .line 756
    .line 757
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    const-string v7, "Deleted native event file from outbox: %s"

    .line 762
    .line 763
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v8

    .line 767
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v8

    .line 771
    invoke-interface {v0, v4, v7, v8}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_e

    .line 772
    .line 773
    .line 774
    iget-object v0, v6, Lio/sentry/n;->b:Ljava/lang/Object;

    .line 775
    .line 776
    move-object v3, v0

    .line 777
    check-cast v3, Lio/sentry/j5;

    .line 778
    .line 779
    invoke-virtual {v2}, Lio/sentry/j5;->d()Ljava/util/ArrayList;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    iget-object v4, v2, Lio/sentry/y4;->p0:Lio/sentry/protocol/f;

    .line 784
    .line 785
    invoke-virtual {v2}, Lio/sentry/j5;->e()Ljava/util/ArrayList;

    .line 786
    .line 787
    .line 788
    move-result-object v5

    .line 789
    if-eqz v0, :cond_20

    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 792
    .line 793
    .line 794
    move-result v7

    .line 795
    if-nez v7, :cond_20

    .line 796
    .line 797
    if-eqz v4, :cond_20

    .line 798
    .line 799
    if-eqz v5, :cond_20

    .line 800
    .line 801
    const/4 v7, 0x0

    .line 802
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v7

    .line 806
    check-cast v7, Lio/sentry/protocol/v;

    .line 807
    .line 808
    iget-object v7, v7, Lio/sentry/protocol/v;->h0:Lio/sentry/protocol/o;

    .line 809
    .line 810
    if-eqz v7, :cond_1d

    .line 811
    .line 812
    sget-object v8, Lio/sentry/android/core/internal/tombstone/a;->TOMBSTONE_MERGED:Lio/sentry/android/core/internal/tombstone/a;

    .line 813
    .line 814
    invoke-virtual {v8}, Lio/sentry/android/core/internal/tombstone/a;->getValue()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    iput-object v8, v7, Lio/sentry/protocol/o;->X:Ljava/lang/String;

    .line 819
    .line 820
    :cond_1d
    iget-object v7, v3, Lio/sentry/j5;->s0:Lio/sentry/protocol/p;

    .line 821
    .line 822
    if-eqz v7, :cond_1e

    .line 823
    .line 824
    iget-object v7, v7, Lio/sentry/protocol/p;->Y:Ljava/lang/String;

    .line 825
    .line 826
    if-eqz v7, :cond_1e

    .line 827
    .line 828
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 829
    .line 830
    .line 831
    move-result v7

    .line 832
    if-eqz v7, :cond_1f

    .line 833
    .line 834
    :cond_1e
    iget-object v2, v2, Lio/sentry/j5;->s0:Lio/sentry/protocol/p;

    .line 835
    .line 836
    iput-object v2, v3, Lio/sentry/j5;->s0:Lio/sentry/protocol/p;

    .line 837
    .line 838
    :cond_1f
    invoke-virtual {v3, v0}, Lio/sentry/j5;->h(Ljava/util/List;)V

    .line 839
    .line 840
    .line 841
    iput-object v4, v3, Lio/sentry/y4;->p0:Lio/sentry/protocol/f;

    .line 842
    .line 843
    new-instance v0, Lio/sentry/k2;

    .line 844
    .line 845
    invoke-direct {v0, v5}, Lio/sentry/k2;-><init>(Ljava/util/List;)V

    .line 846
    .line 847
    .line 848
    iput-object v0, v3, Lio/sentry/j5;->u0:Lio/sentry/k2;

    .line 849
    .line 850
    :cond_20
    iget-object v0, v6, Lio/sentry/n;->d:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v0, Lio/sentry/internal/debugmeta/c;

    .line 853
    .line 854
    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->Z:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v0, Ljava/lang/Iterable;

    .line 857
    .line 858
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 863
    .line 864
    .line 865
    move-result v0

    .line 866
    if-eqz v0, :cond_23

    .line 867
    .line 868
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    check-cast v0, Lio/sentry/h5;

    .line 873
    .line 874
    :try_start_17
    iget-object v4, v0, Lio/sentry/h5;->a:Lio/sentry/i5;

    .line 875
    .line 876
    iget-object v5, v4, Lio/sentry/i5;->Z:Ljava/lang/String;

    .line 877
    .line 878
    iget-object v4, v4, Lio/sentry/i5;->g0:Lio/sentry/r5;

    .line 879
    .line 880
    sget-object v6, Lio/sentry/r5;->Attachment:Lio/sentry/r5;

    .line 881
    .line 882
    if-ne v4, v6, :cond_21

    .line 883
    .line 884
    if-nez v5, :cond_22

    .line 885
    .line 886
    :cond_21
    move-object/from16 v5, p4

    .line 887
    .line 888
    goto :goto_18

    .line 889
    :cond_22
    new-instance v4, Lio/sentry/a;

    .line 890
    .line 891
    invoke-virtual {v0}, Lio/sentry/h5;->g()[B

    .line 892
    .line 893
    .line 894
    move-result-object v6

    .line 895
    iget-object v0, v0, Lio/sentry/h5;->a:Lio/sentry/i5;

    .line 896
    .line 897
    iget-object v7, v0, Lio/sentry/i5;->X:Ljava/lang/String;

    .line 898
    .line 899
    iget-object v0, v0, Lio/sentry/i5;->j0:Ljava/lang/String;

    .line 900
    .line 901
    invoke-direct {v4, v6, v5, v7, v0}, Lio/sentry/a;-><init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 902
    .line 903
    .line 904
    move-object/from16 v5, p4

    .line 905
    .line 906
    :try_start_18
    iget-object v0, v5, Lio/sentry/n0;->b:Ljava/util/ArrayList;

    .line 907
    .line 908
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    .line 909
    .line 910
    .line 911
    goto :goto_18

    .line 912
    :catchall_c
    move-exception v0

    .line 913
    goto :goto_19

    .line 914
    :catchall_d
    move-exception v0

    .line 915
    move-object/from16 v5, p4

    .line 916
    .line 917
    :goto_19
    invoke-virtual {v1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 918
    .line 919
    .line 920
    move-result-object v4

    .line 921
    sget-object v6, Lio/sentry/s5;->DEBUG:Lio/sentry/s5;

    .line 922
    .line 923
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    const-string v7, "Failed to process envelope item: %s"

    .line 932
    .line 933
    invoke-interface {v4, v6, v7, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    goto :goto_18

    .line 937
    :cond_23
    return-object v3

    .line 938
    :catchall_e
    move-exception v0

    .line 939
    goto :goto_1a

    .line 940
    :cond_24
    :try_start_19
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    sget-object v1, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 945
    .line 946
    const-string v2, "Failed to delete native event file: %s"

    .line 947
    .line 948
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v4

    .line 956
    invoke-interface {v0, v1, v2, v4}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_e

    .line 957
    .line 958
    .line 959
    goto :goto_1b

    .line 960
    :goto_1a
    invoke-virtual {v5}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    sget-object v2, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 965
    .line 966
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v3

    .line 974
    const-string v4, "Error deleting native event file: %s"

    .line 975
    .line 976
    invoke-interface {v1, v2, v0, v4, v3}, Lio/sentry/ILogger;->d(Lio/sentry/s5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    :goto_1b
    return-object v16
.end method
