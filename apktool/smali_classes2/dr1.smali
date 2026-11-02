.class public final Ldr1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Ljava/lang/String;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:S

.field public final synthetic j0:Ljava/util/LinkedHashMap;

.field public final synthetic k0:Lgn2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/LinkedHashMap;Lgn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldr1;->g0:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Ldr1;->h0:Ljava/lang/String;

    .line 4
    .line 5
    iput-short p3, p0, Ldr1;->i0:S

    .line 6
    .line 7
    iput-object p4, p0, Ldr1;->j0:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iput-object p5, p0, Ldr1;->k0:Lgn2;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p2, p1}, Ldr1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldr1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldr1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 7

    .line 1
    new-instance v0, Ldr1;

    .line 2
    .line 3
    iget-object v4, p0, Ldr1;->j0:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    iget-object v5, p0, Ldr1;->k0:Lgn2;

    .line 6
    .line 7
    iget-object v1, p0, Ldr1;->g0:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Ldr1;->h0:Ljava/lang/String;

    .line 10
    .line 11
    iget-short v3, p0, Ldr1;->i0:S

    .line 12
    .line 13
    move-object v6, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Ldr1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/LinkedHashMap;Lgn2;Lq51;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-object p1, p0, Ldr1;->g0:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Ldr1;->h0:Ljava/lang/String;

    .line 11
    .line 12
    iget-short v3, p0, Ldr1;->i0:S

    .line 13
    .line 14
    iget-object v4, p0, Ldr1;->k0:Lgn2;

    .line 15
    .line 16
    const-string v5, "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 IP DNS-\u0441\u0435\u0440\u0432\u0435\u0440\u0430: "

    .line 17
    .line 18
    const-string v6, "\u0417\u0430\u043f\u0443\u0441\u043a \u0440\u0435\u0437\u043e\u043b\u0432\u0430 \u0434\u043b\u044f: "

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v6, " \u0447\u0435\u0440\u0435\u0437 "

    .line 30
    .line 31
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-interface {v4, v6}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 45
    .line 46
    .line 47
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :try_start_2
    new-instance v6, Ljava/net/DatagramSocket;

    .line 49
    .line 50
    invoke-direct {v6}, Ljava/net/DatagramSocket;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v3}, Ljava/net/DatagramSocket;->setSoTimeout(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    .line 55
    .line 56
    :try_start_3
    invoke-static {v2}, Loy1;->p(Ljava/lang/String;)[B

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v8, Ljava/net/DatagramPacket;

    .line 61
    .line 62
    array-length v9, v3

    .line 63
    const/16 v10, 0x35

    .line 64
    .line 65
    invoke-direct {v8, v3, v9, v5, v10}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v8}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 69
    .line 70
    .line 71
    const/16 v3, 0x400

    .line 72
    .line 73
    new-array v5, v3, [B

    .line 74
    .line 75
    new-instance v8, Ljava/net/DatagramPacket;

    .line 76
    .line 77
    invoke-direct {v8, v5, v3}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, v8}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v8}, Ljava/net/DatagramPacket;->getLength()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-static {v5, v8, v3}, Loy1;->D([BILjava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_0

    .line 100
    .line 101
    new-instance v5, Lhr1;

    .line 102
    .line 103
    invoke-direct {v5, v3}, Lhr1;-><init>(Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v3

    .line 108
    goto :goto_2

    .line 109
    :cond_0
    new-instance v5, Lgr1;

    .line 110
    .line 111
    const-string v3, "\u0421\u0435\u0440\u0432\u0435\u0440 \u043f\u0440\u0438\u0441\u043b\u0430\u043b \u043e\u0442\u0432\u0435\u0442, \u043d\u043e \u0432 \u043d\u0435\u043c \u043d\u0435\u0442 IPv4 (A) \u0437\u0430\u043f\u0438\u0441\u0435\u0439."

    .line 112
    .line 113
    invoke-direct {v5, v3, v7}, Lgr1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_1
    move-exception v3

    .line 118
    move-object v6, v7

    .line 119
    goto :goto_2

    .line 120
    :catch_0
    move-exception v3

    .line 121
    :try_start_4
    new-instance v6, Lgr1;

    .line 122
    .line 123
    new-instance v8, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-direct {v6, v5, v3}, Lgr1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    .line 137
    .line 138
    move-object v5, v6

    .line 139
    move-object v6, v7

    .line 140
    :goto_0
    if-eqz v6, :cond_1

    .line 141
    .line 142
    :goto_1
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_2
    :try_start_5
    instance-of v5, v3, Ljava/lang/InterruptedException;

    .line 147
    .line 148
    if-nez v5, :cond_6

    .line 149
    .line 150
    instance-of v5, v3, Ljava/util/concurrent/CancellationException;

    .line 151
    .line 152
    if-nez v5, :cond_6

    .line 153
    .line 154
    new-instance v5, Lrj6;

    .line 155
    .line 156
    invoke-direct {v5, v3}, Lrj6;-><init>(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 157
    .line 158
    .line 159
    if-eqz v6, :cond_1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    :goto_3
    invoke-static {v5}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    if-nez v3, :cond_2

    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_2
    instance-of v5, v3, Ljava/net/SocketTimeoutException;

    .line 170
    .line 171
    if-eqz v5, :cond_3

    .line 172
    .line 173
    new-instance v5, Lgr1;

    .line 174
    .line 175
    const-string v6, "\u0422\u0430\u0439\u043c\u0430\u0443\u0442 \u043e\u0436\u0438\u0434\u0430\u043d\u0438\u044f \u043e\u0442\u0432\u0435\u0442\u0430 \u043e\u0442 "

    .line 176
    .line 177
    invoke-static {v6, p1}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-direct {v5, v6, v3}, Lgr1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_3
    new-instance v5, Lgr1;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    const-string v8, "\u041a\u0440\u0438\u0442\u0438\u0447\u0435\u0441\u043a\u0430\u044f \u043e\u0448\u0438\u0431\u043a\u0430: "

    .line 192
    .line 193
    invoke-static {v8, v6}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    invoke-direct {v5, v6, v3}, Lgr1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :goto_4
    check-cast v5, Lir1;

    .line 201
    .line 202
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 203
    .line 204
    .line 205
    move-result-wide v8

    .line 206
    sub-long/2addr v8, v0

    .line 207
    instance-of v0, v5, Lhr1;

    .line 208
    .line 209
    const-string v1, " domain:"

    .line 210
    .line 211
    const-string v3, "dnsServer:"

    .line 212
    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    long-to-int v0, v8

    .line 216
    new-instance v6, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-direct {v6, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 219
    .line 220
    .line 221
    iget-object p0, p0, Ldr1;->j0:Ljava/util/LinkedHashMap;

    .line 222
    .line 223
    invoke-interface {p0, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    check-cast v5, Lhr1;

    .line 227
    .line 228
    const-string p0, " SUCCESS resolvedIps:"

    .line 229
    .line 230
    invoke-static {v3, p1, v1, v2, p0}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    iget-object p1, v5, Lhr1;->a:Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string p1, " time:"

    .line 240
    .line 241
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-interface {v4, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_4
    instance-of p0, v5, Lgr1;

    .line 256
    .line 257
    if-eqz p0, :cond_5

    .line 258
    .line 259
    check-cast v5, Lgr1;

    .line 260
    .line 261
    const-string p0, " FAILURE time:"

    .line 262
    .line 263
    invoke-static {v3, p1, v1, v2, p0}, Loi0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {p0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-string p1, " error:"

    .line 271
    .line 272
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    iget-object p1, v5, Lgr1;->a:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p0

    .line 284
    invoke-interface {v4, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    :goto_5
    sget-object p0, Ldn8;->a:Ldn8;

    .line 288
    .line 289
    return-object p0

    .line 290
    :cond_5
    invoke-static {}, Lb61;->c()V

    .line 291
    .line 292
    .line 293
    return-object v7

    .line 294
    :catchall_2
    move-exception p0

    .line 295
    goto :goto_6

    .line 296
    :cond_6
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 297
    :goto_6
    if-eqz v6, :cond_7

    .line 298
    .line 299
    invoke-virtual {v6}, Ljava/net/DatagramSocket;->close()V

    .line 300
    .line 301
    .line 302
    :cond_7
    throw p0
.end method
