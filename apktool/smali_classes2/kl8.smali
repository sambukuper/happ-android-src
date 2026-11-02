.class public final Lkl8;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Ljava/lang/String;

.field public final synthetic h0:Ljh4;

.field public final synthetic i0:[B

.field public final synthetic j0:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljh4;[BJLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkl8;->g0:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lkl8;->h0:Ljh4;

    .line 4
    .line 5
    iput-object p3, p0, Lkl8;->i0:[B

    .line 6
    .line 7
    iput-wide p4, p0, Lkl8;->j0:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lkl8;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lkl8;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lkl8;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 7

    .line 1
    new-instance v0, Lkl8;

    .line 2
    .line 3
    iget-object v3, p0, Lkl8;->i0:[B

    .line 4
    .line 5
    iget-wide v4, p0, Lkl8;->j0:J

    .line 6
    .line 7
    iget-object v1, p0, Lkl8;->g0:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lkl8;->h0:Ljh4;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Lkl8;-><init>(Ljava/lang/String;Ljh4;[BJLq51;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x35

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lkl8;->g0:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "["

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x6

    .line 20
    const/4 v5, -0x1

    .line 21
    const/4 v6, 0x1

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    const-string v3, "]"

    .line 25
    .line 26
    invoke-static {v1, v3, v2, v2, v4}, Lfm7;->m0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ne v3, v5, :cond_0

    .line 31
    .line 32
    new-instance p1, Lqg5;

    .line 33
    .line 34
    invoke-direct {p1, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v1, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    add-int/2addr v3, v6

    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v3, ":"

    .line 48
    .line 49
    invoke-static {v1, v2, v3}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v1, Lqg5;

    .line 74
    .line 75
    invoke-direct {v1, v0, p1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    move-object p1, v1

    .line 79
    goto :goto_1

    .line 80
    :cond_2
    const/16 v3, 0x3a

    .line 81
    .line 82
    invoke-static {v1, v3, v2, v4}, Lfm7;->q0(Ljava/lang/CharSequence;CII)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-static {v1, v3, v2, v4}, Lfm7;->l0(Ljava/lang/CharSequence;CII)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eq v7, v5, :cond_4

    .line 91
    .line 92
    if-ne v7, v3, :cond_4

    .line 93
    .line 94
    invoke-virtual {v1, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    add-int/2addr v7, v6

    .line 99
    invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v1}, Lmm7;->b0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    new-instance v1, Lqg5;

    .line 118
    .line 119
    invoke-direct {v1, v0, p1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    new-instance p1, Lqg5;

    .line 124
    .line 125
    invoke-direct {p1, v1, v0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :goto_1
    iget-object v0, p1, Lqg5;->X:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ljava/lang/String;

    .line 131
    .line 132
    iget-object p1, p1, Lqg5;->Y:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    :try_start_0
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 141
    .line 142
    .line 143
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 144
    iget-wide v5, p0, Lkl8;->j0:J

    .line 145
    .line 146
    iget-object v3, p0, Lkl8;->i0:[B

    .line 147
    .line 148
    iget-object p0, p0, Lkl8;->h0:Ljh4;

    .line 149
    .line 150
    if-eqz p0, :cond_5

    .line 151
    .line 152
    array-length v7, v3

    .line 153
    new-instance v8, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v9, "udpExchange size:"

    .line 156
    .line 157
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v7, " host:"

    .line 164
    .line 165
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v0, " port:"

    .line 172
    .line 173
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v0, " addr:"

    .line 180
    .line 181
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v0, " timeoutMillis:"

    .line 188
    .line 189
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const/4 v7, 0x0

    .line 200
    invoke-static {p0, v0, v7, v4}, Ljh4;->v(Ljh4;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 201
    .line 202
    .line 203
    :cond_5
    new-instance p0, Ljava/net/DatagramSocket;

    .line 204
    .line 205
    invoke-direct {p0}, Ljava/net/DatagramSocket;-><init>()V

    .line 206
    .line 207
    .line 208
    const-wide/32 v7, 0x7fffffff

    .line 209
    .line 210
    .line 211
    cmp-long v0, v5, v7

    .line 212
    .line 213
    if-lez v0, :cond_6

    .line 214
    .line 215
    move-wide v5, v7

    .line 216
    :cond_6
    long-to-int v0, v5

    .line 217
    :try_start_1
    invoke-virtual {p0, v0}, Ljava/net/DatagramSocket;->setSoTimeout(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 218
    .line 219
    .line 220
    :try_start_2
    new-instance v0, Ljava/net/DatagramPacket;

    .line 221
    .line 222
    array-length v4, v3

    .line 223
    invoke-direct {v0, v3, v4, v1, p1}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 227
    .line 228
    .line 229
    const/16 p1, 0x1000

    .line 230
    .line 231
    new-array v0, p1, [B

    .line 232
    .line 233
    new-instance v1, Ljava/net/DatagramPacket;

    .line 234
    .line 235
    invoke-direct {v1, v0, p1}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, v1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_7

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-static {v2, p1, v0}, Leu;->j0(II[B)[B

    .line 252
    .line 253
    .line 254
    move-result-object p1
    :try_end_2
    .catch Lte8; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 255
    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V

    .line 256
    .line 257
    .line 258
    return-object p1

    .line 259
    :catchall_0
    move-exception p1

    .line 260
    goto :goto_2

    .line 261
    :catch_0
    move-exception p1

    .line 262
    goto :goto_3

    .line 263
    :catch_1
    move-exception p1

    .line 264
    goto :goto_4

    .line 265
    :cond_7
    :try_start_3
    new-instance p1, Lte8$c;

    .line 266
    .line 267
    invoke-direct {p1}, Lte8$c;-><init>()V

    .line 268
    .line 269
    .line 270
    throw p1
    :try_end_3
    .catch Lte8; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 271
    :goto_2
    :try_start_4
    new-instance v0, Lte8$b;

    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    new-instance v2, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v3, "UDP I/O failure: "

    .line 280
    .line 281
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :catchall_1
    move-exception p1

    .line 296
    goto :goto_5

    .line 297
    :goto_3
    throw p1

    .line 298
    :catch_2
    new-instance p1, Lte8$d;

    .line 299
    .line 300
    invoke-direct {p1}, Lte8$d;-><init>()V

    .line 301
    .line 302
    .line 303
    throw p1

    .line 304
    :goto_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 305
    :goto_5
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 306
    :catchall_2
    move-exception v0

    .line 307
    invoke-static {p0, p1}, Loc;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :catchall_3
    move-exception p0

    .line 312
    new-instance p1, Lte8$a;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    const-string v1, "invalid resolver address: "

    .line 318
    .line 319
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw p1
.end method
