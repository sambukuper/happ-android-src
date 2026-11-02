.class public final Li23;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lo42;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lp76;

.field public final b:Ly76;

.field public final c:Lh23;

.field public volatile d:Lo23;

.field public final e:Lp06;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, ":scheme"

    .line 2
    .line 3
    const-string v11, ":authority"

    .line 4
    .line 5
    const-string v0, "connection"

    .line 6
    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    const-string v2, "keep-alive"

    .line 10
    .line 11
    const-string v3, "proxy-connection"

    .line 12
    .line 13
    const-string v4, "te"

    .line 14
    .line 15
    const-string v5, "transfer-encoding"

    .line 16
    .line 17
    const-string v6, "encoding"

    .line 18
    .line 19
    const-string v7, "upgrade"

    .line 20
    .line 21
    const-string v8, ":method"

    .line 22
    .line 23
    const-string v9, ":path"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lks8;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Li23;->g:Ljava/util/List;

    .line 34
    .line 35
    const-string v7, "encoding"

    .line 36
    .line 37
    const-string v8, "upgrade"

    .line 38
    .line 39
    const-string v1, "connection"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    const-string v3, "keep-alive"

    .line 44
    .line 45
    const-string v4, "proxy-connection"

    .line 46
    .line 47
    const-string v5, "te"

    .line 48
    .line 49
    const-string v6, "transfer-encoding"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lks8;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Li23;->h:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Ll95;Lp76;Ly76;Lh23;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Li23;->a:Lp76;

    .line 8
    .line 9
    iput-object p3, p0, Li23;->b:Ly76;

    .line 10
    .line 11
    iput-object p4, p0, Li23;->c:Lh23;

    .line 12
    .line 13
    iget-object p1, p1, Ll95;->n0:Ljava/util/List;

    .line 14
    .line 15
    sget-object p2, Lp06;->h0:Lp06;

    .line 16
    .line 17
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object p2, Lp06;->g0:Lp06;

    .line 25
    .line 26
    :goto_0
    iput-object p2, p0, Li23;->e:Lp06;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lzf6;)Lje7;
    .locals 0

    .line 1
    iget-object p0, p0, Li23;->d:Lo23;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lo23;->i:Lm23;

    .line 7
    .line 8
    return-object p0
.end method

.method public final b(Lzf6;)J
    .locals 0

    .line 1
    invoke-static {p1}, Ls23;->a(Lzf6;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-static {p1}, Lks8;->i(Lzf6;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public final c()Lp76;
    .locals 0

    .line 1
    iget-object p0, p0, Li23;->a:Lp76;

    .line 2
    .line 3
    return-object p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li23;->f:Z

    .line 3
    .line 4
    iget-object p0, p0, Li23;->d:Lo23;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x9

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lo23;->e(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final d(Ly5;)V
    .locals 10

    .line 1
    iget-object v0, p0, Li23;->d:Lo23;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Ly5;->g0:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lnz2;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Lnz2;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, 0x4

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lkz2;

    .line 22
    .line 23
    sget-object v3, Lkz2;->f:Lkb0;

    .line 24
    .line 25
    iget-object v4, p1, Ly5;->Z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, Lkz2;-><init>(Lkb0;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v2, Lkz2;

    .line 36
    .line 37
    sget-object v3, Lkz2;->g:Lkb0;

    .line 38
    .line 39
    iget-object p1, p1, Ly5;->Y:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lu23;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lu23;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p1}, Lu23;->d()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    new-instance v6, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/16 v4, 0x3f

    .line 62
    .line 63
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :cond_1
    invoke-direct {v2, v3, v4}, Lkz2;-><init>(Lkb0;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    const-string v2, "Host"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Lnz2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    new-instance v3, Lkz2;

    .line 88
    .line 89
    sget-object v4, Lkz2;->i:Lkb0;

    .line 90
    .line 91
    invoke-direct {v3, v4, v2}, Lkz2;-><init>(Lkb0;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_2
    new-instance v2, Lkz2;

    .line 98
    .line 99
    sget-object v3, Lkz2;->h:Lkb0;

    .line 100
    .line 101
    iget-object p1, p1, Lu23;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-direct {v2, v3, p1}, Lkz2;-><init>(Lkb0;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lnz2;->size()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/4 v2, 0x0

    .line 114
    move v3, v2

    .line 115
    :goto_0
    if-ge v3, p1, :cond_5

    .line 116
    .line 117
    invoke-virtual {v0, v3}, Lnz2;->b(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v5, Li23;->g:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_3

    .line 140
    .line 141
    const-string v5, "te"

    .line 142
    .line 143
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_4

    .line 148
    .line 149
    invoke-virtual {v0, v3}, Lnz2;->e(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    const-string v6, "trailers"

    .line 154
    .line 155
    invoke-static {v5, v6}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_4

    .line 160
    .line 161
    :cond_3
    new-instance v5, Lkz2;

    .line 162
    .line 163
    invoke-virtual {v0, v3}, Lnz2;->e(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-direct {v5, v4, v6}, Lkz2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_5
    iget-object v6, p0, Li23;->c:Lh23;

    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    xor-int/lit8 v7, v2, 0x1

    .line 182
    .line 183
    iget-object p1, v6, Lh23;->y0:Lp23;

    .line 184
    .line 185
    monitor-enter p1

    .line 186
    :try_start_0
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 187
    :try_start_1
    iget v0, v6, Lh23;->g0:I

    .line 188
    .line 189
    const v2, 0x3fffffff    # 1.9999999f

    .line 190
    .line 191
    .line 192
    if-le v0, v2, :cond_6

    .line 193
    .line 194
    const/16 v0, 0x8

    .line 195
    .line 196
    invoke-virtual {v6, v0}, Lh23;->p(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :catchall_0
    move-exception v0

    .line 201
    move-object p0, v0

    .line 202
    goto :goto_2

    .line 203
    :cond_6
    :goto_1
    iget-boolean v0, v6, Lh23;->h0:Z

    .line 204
    .line 205
    if-nez v0, :cond_9

    .line 206
    .line 207
    iget v5, v6, Lh23;->g0:I

    .line 208
    .line 209
    add-int/lit8 v0, v5, 0x2

    .line 210
    .line 211
    iput v0, v6, Lh23;->g0:I

    .line 212
    .line 213
    new-instance v4, Lo23;

    .line 214
    .line 215
    const/4 v9, 0x0

    .line 216
    const/4 v8, 0x0

    .line 217
    invoke-direct/range {v4 .. v9}, Lo23;-><init>(ILh23;ZZLnz2;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Lo23;->g()Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_7

    .line 225
    .line 226
    iget-object v0, v6, Lh23;->Y:Ljava/util/LinkedHashMap;

    .line 227
    .line 228
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 233
    .line 234
    .line 235
    :cond_7
    :try_start_2
    monitor-exit v6

    .line 236
    iget-object v0, v6, Lh23;->y0:Lp23;

    .line 237
    .line 238
    invoke-virtual {v0, v7, v5, v1}, Lp23;->u(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 239
    .line 240
    .line 241
    monitor-exit p1

    .line 242
    iget-object p1, v6, Lh23;->y0:Lp23;

    .line 243
    .line 244
    invoke-virtual {p1}, Lp23;->flush()V

    .line 245
    .line 246
    .line 247
    iput-object v4, p0, Li23;->d:Lo23;

    .line 248
    .line 249
    iget-boolean p1, p0, Li23;->f:Z

    .line 250
    .line 251
    iget-object v0, p0, Li23;->d:Lo23;

    .line 252
    .line 253
    if-nez p1, :cond_8

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object p1, v0, Lo23;->k:Ln23;

    .line 259
    .line 260
    iget-object v0, p0, Li23;->b:Ly76;

    .line 261
    .line 262
    iget v0, v0, Ly76;->g:I

    .line 263
    .line 264
    int-to-long v0, v0

    .line 265
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 266
    .line 267
    invoke-virtual {p1, v0, v1, v2}, Lta8;->timeout(JLjava/util/concurrent/TimeUnit;)Lta8;

    .line 268
    .line 269
    .line 270
    iget-object p1, p0, Li23;->d:Lo23;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object p1, p1, Lo23;->l:Ln23;

    .line 276
    .line 277
    iget-object p0, p0, Li23;->b:Ly76;

    .line 278
    .line 279
    iget p0, p0, Ly76;->h:I

    .line 280
    .line 281
    int-to-long v0, p0

    .line 282
    invoke-virtual {p1, v0, v1, v2}, Lta8;->timeout(JLjava/util/concurrent/TimeUnit;)Lta8;

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    const/16 p0, 0x9

    .line 290
    .line 291
    invoke-virtual {v0, p0}, Lo23;->e(I)V

    .line 292
    .line 293
    .line 294
    const-string p0, "Canceled"

    .line 295
    .line 296
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :catchall_1
    move-exception v0

    .line 301
    move-object p0, v0

    .line 302
    goto :goto_3

    .line 303
    :cond_9
    :try_start_3
    new-instance p0, Ly11;

    .line 304
    .line 305
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 306
    .line 307
    .line 308
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 309
    :goto_2
    :try_start_4
    monitor-exit v6

    .line 310
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 311
    :goto_3
    monitor-exit p1

    .line 312
    throw p0
.end method

.method public final finishRequest()V
    .locals 2

    .line 1
    iget-object p0, p0, Li23;->d:Lo23;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lo23;->h:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lo23;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v0, "reply before requesting the sink"

    .line 19
    .line 20
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    monitor-exit p0

    .line 29
    iget-object p0, p0, Lo23;->j:Ll23;

    .line 30
    .line 31
    invoke-virtual {p0}, Ll23;->close()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit p0

    .line 36
    throw v0
.end method

.method public final flushRequest()V
    .locals 0

    .line 1
    iget-object p0, p0, Li23;->c:Lh23;

    .line 2
    .line 3
    iget-object p0, p0, Lh23;->y0:Lp23;

    .line 4
    .line 5
    invoke-virtual {p0}, Lp23;->flush()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final readResponseHeaders(Z)Lyf6;
    .locals 10

    .line 1
    iget-object v0, p0, Li23;->d:Lo23;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v2, v0, Lo23;->k:Ln23;

    .line 8
    .line 9
    invoke-virtual {v2}, Lnv;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    :goto_0
    :try_start_1
    iget-object v2, v0, Lo23;->g:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget v2, v0, Lo23;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 33
    .line 34
    .line 35
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 38
    .line 39
    .line 40
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_0
    :try_start_4
    iget-object v2, v0, Lo23;->k:Ln23;

    .line 45
    .line 46
    invoke-virtual {v2}, Ln23;->exitAndThrowIfTimedOut()V

    .line 47
    .line 48
    .line 49
    iget-object v2, v0, Lo23;->g:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    iget-object v2, v0, Lo23;->g:Ljava/util/ArrayDeque;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast v2, Lnz2;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 67
    .line 68
    monitor-exit v0

    .line 69
    iget-object p0, p0, Li23;->e:Lp06;

    .line 70
    .line 71
    new-instance v0, Ljava/util/ArrayList;

    .line 72
    .line 73
    const/16 v3, 0x14

    .line 74
    .line 75
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lnz2;->size()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v4, 0x0

    .line 83
    move-object v6, v1

    .line 84
    move v5, v4

    .line 85
    :goto_1
    if-ge v5, v3, :cond_3

    .line 86
    .line 87
    invoke-virtual {v2, v5}, Lnz2;->b(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v2, v5}, Lnz2;->e(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const-string v9, ":status"

    .line 96
    .line 97
    invoke-static {v7, v9}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_1

    .line 102
    .line 103
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v7, "HTTP/1.1 "

    .line 106
    .line 107
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-static {v6}, Ljb5;->D(Ljava/lang/String;)Lne;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_2

    .line 122
    :cond_1
    sget-object v9, Li23;->h:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_2

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    invoke-static {v8}, Lfm7;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    if-eqz v6, :cond_5

    .line 154
    .line 155
    new-instance v2, Lyf6;

    .line 156
    .line 157
    invoke-direct {v2}, Lyf6;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object p0, v2, Lyf6;->b:Lp06;

    .line 161
    .line 162
    iget p0, v6, Lne;->b:I

    .line 163
    .line 164
    iput p0, v2, Lyf6;->c:I

    .line 165
    .line 166
    iget-object p0, v6, Lne;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, Ljava/lang/String;

    .line 169
    .line 170
    iput-object p0, v2, Lyf6;->d:Ljava/lang/String;

    .line 171
    .line 172
    new-array p0, v4, [Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, [Ljava/lang/String;

    .line 179
    .line 180
    new-instance v0, Lps;

    .line 181
    .line 182
    const/4 v3, 0x1

    .line 183
    invoke-direct {v0, v3}, Lps;-><init>(B)V

    .line 184
    .line 185
    .line 186
    iget-object v3, v0, Lps;->b:Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-static {v3, p0}, Lbw0;->e0(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iput-object v0, v2, Lyf6;->f:Lps;

    .line 192
    .line 193
    if-eqz p1, :cond_4

    .line 194
    .line 195
    iget p0, v2, Lyf6;->c:I

    .line 196
    .line 197
    const/16 p1, 0x64

    .line 198
    .line 199
    if-ne p0, p1, :cond_4

    .line 200
    .line 201
    return-object v1

    .line 202
    :cond_4
    return-object v2

    .line 203
    :cond_5
    const-string p0, "Expected \':status\' header not present"

    .line 204
    .line 205
    invoke-static {p0}, Lxw3;->k(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-object v1

    .line 209
    :catchall_1
    move-exception p0

    .line 210
    goto :goto_5

    .line 211
    :cond_6
    :try_start_5
    iget-object p0, v0, Lo23;->n:Ljava/io/IOException;

    .line 212
    .line 213
    if-nez p0, :cond_8

    .line 214
    .line 215
    new-instance p0, Lel7;

    .line 216
    .line 217
    iget p1, v0, Lo23;->m:I

    .line 218
    .line 219
    if-eqz p1, :cond_7

    .line 220
    .line 221
    invoke-direct {p0, p1}, Lel7;-><init>(I)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_7
    throw v1

    .line 226
    :cond_8
    :goto_3
    throw p0

    .line 227
    :goto_4
    iget-object p1, v0, Lo23;->k:Ln23;

    .line 228
    .line 229
    invoke-virtual {p1}, Ln23;->exitAndThrowIfTimedOut()V

    .line 230
    .line 231
    .line 232
    throw p0

    .line 233
    :goto_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 234
    throw p0

    .line 235
    :cond_9
    const-string p0, "stream wasn\'t created"

    .line 236
    .line 237
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-object v1
.end method
