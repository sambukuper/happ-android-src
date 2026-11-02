.class public final Ltr1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lvr1;

.field public h0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

.field public i0:J

.field public j0:Z

.field public synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Lvr1;

.field public final synthetic m0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;


# direct methods
.method public constructor <init>(Lvr1;Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltr1;->l0:Lvr1;

    .line 2
    .line 3
    iput-object p2, p0, Ltr1;->m0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Ltr1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ltr1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ltr1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance v0, Ltr1;

    .line 2
    .line 3
    iget-object v1, p0, Ltr1;->l0:Lvr1;

    .line 4
    .line 5
    iget-object p0, p0, Ltr1;->m0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Ltr1;-><init>(Lvr1;Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Ltr1;->k0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Ltr1;->k0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb71;

    .line 4
    .line 5
    iget-boolean v1, p0, Ltr1;->j0:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Ltr1;->i0:J

    .line 14
    .line 15
    iget-object v3, p0, Ltr1;->h0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 16
    .line 17
    iget-object p0, p0, Ltr1;->g0:Lvr1;

    .line 18
    .line 19
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v3

    .line 30
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Ltr1;->m0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 34
    .line 35
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;->b()Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v4, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v5, "withResolvers: START data:"

    .line 42
    .line 43
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v4, p0, Ltr1;->l0:Lvr1;

    .line 54
    .line 55
    const/4 v5, 0x6

    .line 56
    invoke-static {v4, v1, v3, v5}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 57
    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    iget-object v1, v4, Lvr1;->c:Ljava/util/List;

    .line 64
    .line 65
    sget-object v8, Lm66;->X:Ll66;

    .line 66
    .line 67
    invoke-static {v1}, Lwv0;->J0(Ljava/util/Collection;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/lang/String;

    .line 72
    .line 73
    new-instance v8, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v9, "domain:"

    .line 76
    .line 77
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-static {v4, v8, v3, v5}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 88
    .line 89
    .line 90
    iget-object v5, v4, Lvr1;->f:Lp91;

    .line 91
    .line 92
    invoke-virtual {v5}, Lp91;->i()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eqz v5, :cond_8

    .line 97
    .line 98
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-nez v8, :cond_2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    move-object v5, v3

    .line 106
    :goto_0
    if-eqz v5, :cond_8

    .line 107
    .line 108
    iget-object v3, v4, Lvr1;->b:[B

    .line 109
    .line 110
    new-instance v8, Lvk1;

    .line 111
    .line 112
    const/4 v9, 0x3

    .line 113
    invoke-direct {v8, v4, v9}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v9, Lis1;

    .line 123
    .line 124
    invoke-direct {v9, v1, v3, v5, v8}, Lis1;-><init>(Ljava/lang/String;[BLjava/util/List;Lvk1;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;->a()[B

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v3, v4, Lvr1;->e:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 132
    .line 133
    iput-object v0, p0, Ltr1;->k0:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v4, p0, Ltr1;->g0:Lvr1;

    .line 136
    .line 137
    iput-object p1, p0, Ltr1;->h0:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 138
    .line 139
    iput-wide v6, p0, Ltr1;->i0:J

    .line 140
    .line 141
    iput-boolean v2, p0, Ltr1;->j0:Z

    .line 142
    .line 143
    invoke-virtual {v9, v1, v3, p0}, Lis1;->c([BLsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;Ls51;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    sget-object v0, Lc71;->X:Lc71;

    .line 148
    .line 149
    if-ne p0, v0, :cond_3

    .line 150
    .line 151
    return-object v0

    .line 152
    :cond_3
    move-object v3, p1

    .line 153
    move-wide v0, v6

    .line 154
    move-object p1, p0

    .line 155
    move-object p0, v4

    .line 156
    :goto_1
    check-cast p1, Lt82;

    .line 157
    .line 158
    iget-object v4, p1, Lt82;->a:[B

    .line 159
    .line 160
    if-eqz v4, :cond_4

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    const/4 v2, 0x0

    .line 164
    :goto_2
    iget-object v5, p1, Lt82;->b:Ljava/lang/String;

    .line 165
    .line 166
    if-eqz v2, :cond_5

    .line 167
    .line 168
    iget-object v2, p0, Lvr1;->f:Lp91;

    .line 169
    .line 170
    iput-object v5, v2, Lp91;->g:Ljava/lang/Object;

    .line 171
    .line 172
    :cond_5
    invoke-virtual {v3}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;->b()Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iget-object v6, p1, Lt82;->a:[B

    .line 177
    .line 178
    if-eqz v6, :cond_6

    .line 179
    .line 180
    const-string v6, "SUCCESS"

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    const-string v6, "FAILURE"

    .line 184
    .line 185
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 186
    .line 187
    .line 188
    move-result-wide v7

    .line 189
    sub-long/2addr v7, v0

    .line 190
    invoke-virtual {v3}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;->hashCode()I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v4, :cond_7

    .line 195
    .line 196
    const-string v1, "fail"

    .line 197
    .line 198
    sget-object v3, Liq0;->a:Ljava/nio/charset/Charset;

    .line 199
    .line 200
    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_7
    move-object v1, v4

    .line 209
    :goto_4
    new-instance v3, Ljava/lang/String;

    .line 210
    .line 211
    sget-object v9, Liq0;->a:Ljava/nio/charset/Charset;

    .line 212
    .line 213
    invoke-direct {v3, v1, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 214
    .line 215
    .line 216
    new-instance v1, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v9, "withResolvers\ndata.url:"

    .line 219
    .line 220
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v2, "\nSTATUS:"

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v2, "\ntime:"

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v2, "ms\ndns:"

    .line 243
    .line 244
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v2, "\nsend data:"

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v0, "\nanswer data:\n"

    .line 259
    .line 260
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    sget-object v1, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 271
    .line 272
    const/4 v2, 0x4

    .line 273
    invoke-static {p0, v0, v1, v2}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 274
    .line 275
    .line 276
    new-instance p0, Lqg5;

    .line 277
    .line 278
    iget-object p1, p1, Lt82;->c:Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-direct {p0, p1, v4}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    return-object p0

    .line 284
    :cond_8
    new-instance p0, Lqg5;

    .line 285
    .line 286
    new-instance p1, Ljava/lang/Integer;

    .line 287
    .line 288
    const/16 v0, 0x385

    .line 289
    .line 290
    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-direct {p0, p1, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-object p0
.end method
