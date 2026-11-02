.class public final Lb72;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Lokhttp3/Request$Builder;

.field public final synthetic h0:Le72;

.field public final synthetic i0:J

.field public final synthetic j0:Ljava/net/Proxy;

.field public final synthetic k0:Ljava/util/HashMap;

.field public final synthetic l0:Ljava/lang/String;

.field public final synthetic m0:Z


# direct methods
.method public constructor <init>(Lokhttp3/Request$Builder;Le72;JLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb72;->g0:Lokhttp3/Request$Builder;

    .line 2
    .line 3
    iput-object p2, p0, Lb72;->h0:Le72;

    .line 4
    .line 5
    iput-wide p3, p0, Lb72;->i0:J

    .line 6
    .line 7
    iput-object p5, p0, Lb72;->j0:Ljava/net/Proxy;

    .line 8
    .line 9
    iput-object p6, p0, Lb72;->k0:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p7, p0, Lb72;->l0:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p8, p0, Lb72;->m0:Z

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p9}, Luy7;-><init>(ILq51;)V

    .line 17
    .line 18
    .line 19
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
    invoke-virtual {p0, p2, p1}, Lb72;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lb72;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lb72;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 10

    .line 1
    new-instance v0, Lb72;

    .line 2
    .line 3
    iget-object v7, p0, Lb72;->l0:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v8, p0, Lb72;->m0:Z

    .line 6
    .line 7
    iget-object v1, p0, Lb72;->g0:Lokhttp3/Request$Builder;

    .line 8
    .line 9
    iget-object v2, p0, Lb72;->h0:Le72;

    .line 10
    .line 11
    iget-wide v3, p0, Lb72;->i0:J

    .line 12
    .line 13
    iget-object v5, p0, Lb72;->j0:Ljava/net/Proxy;

    .line 14
    .line 15
    iget-object v6, p0, Lb72;->k0:Ljava/util/HashMap;

    .line 16
    .line 17
    move-object v9, p1

    .line 18
    invoke-direct/range {v0 .. v9}, Lb72;-><init>(Lokhttp3/Request$Builder;Le72;JLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;ZLq51;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lb72;->g0:Lokhttp3/Request$Builder;

    .line 7
    .line 8
    iget-object v2, p0, Lb72;->h0:Le72;

    .line 9
    .line 10
    iget-wide v5, p0, Lb72;->i0:J

    .line 11
    .line 12
    iget-object v7, p0, Lb72;->j0:Ljava/net/Proxy;

    .line 13
    .line 14
    iget-object v8, p0, Lb72;->k0:Ljava/util/HashMap;

    .line 15
    .line 16
    iget-object v9, p0, Lb72;->l0:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v10, p0, Lb72;->m0:Z

    .line 19
    .line 20
    const/4 v11, 0x0

    .line 21
    :try_start_0
    new-instance v0, Lyf8;

    .line 22
    .line 23
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual/range {v2 .. v10}, Le72;->b(Lokhttp3/Request;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lokhttp3/Response;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v0, v3, v1, v11}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    instance-of v3, v0, Ljava/lang/InterruptedException;

    .line 38
    .line 39
    if-nez v3, :cond_c

    .line 40
    .line 41
    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    .line 42
    .line 43
    if-nez v3, :cond_c

    .line 44
    .line 45
    new-instance v3, Lrj6;

    .line 46
    .line 47
    invoke-direct {v3, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    move-object v0, v3

    .line 51
    :goto_0
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object v12

    .line 55
    if-nez v12, :cond_0

    .line 56
    .line 57
    check-cast v0, Lyf8;

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_0
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/4 v3, 0x0

    .line 66
    const/4 v4, 0x1

    .line 67
    iget-wide v5, p0, Lb72;->i0:J

    .line 68
    .line 69
    iget-object v7, p0, Lb72;->j0:Ljava/net/Proxy;

    .line 70
    .line 71
    iget-object v8, p0, Lb72;->k0:Ljava/util/HashMap;

    .line 72
    .line 73
    iget-object v9, p0, Lb72;->l0:Ljava/lang/String;

    .line 74
    .line 75
    iget-boolean v10, p0, Lb72;->m0:Z

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    const-string p0, "Connection reset"

    .line 80
    .line 81
    invoke-static {v0, p0, v3}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-ne p0, v4, :cond_4

    .line 86
    .line 87
    const-string p0, "Connection"

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 90
    .line 91
    .line 92
    :try_start_1
    new-instance p0, Lyf8;

    .line 93
    .line 94
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const/4 v4, 0x0

    .line 99
    invoke-virtual/range {v2 .. v10}, Le72;->b(Lokhttp3/Request;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lokhttp3/Response;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-direct {p0, p1, v1, v11}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move-object p0, v0

    .line 109
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 110
    .line 111
    if-nez p1, :cond_3

    .line 112
    .line 113
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 114
    .line 115
    if-nez p1, :cond_3

    .line 116
    .line 117
    new-instance p1, Lrj6;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, p1

    .line 123
    :goto_1
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-nez p1, :cond_1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_1
    new-instance p0, Lyf8;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-nez v0, :cond_2

    .line 137
    .line 138
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-nez v0, :cond_2

    .line 143
    .line 144
    move-object v0, v1

    .line 145
    :cond_2
    invoke-direct {p0, v11, v0, p1}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    check-cast p0, Lyf8;

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_3
    throw p0

    .line 152
    :cond_4
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-eqz p0, :cond_5

    .line 157
    .line 158
    const-string v0, "timeout"

    .line 159
    .line 160
    invoke-static {p0, v0, v3}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-ne p0, v4, :cond_5

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    instance-of p0, v12, Ljava/io/IOException;

    .line 168
    .line 169
    if-eqz p0, :cond_9

    .line 170
    .line 171
    :goto_3
    :try_start_2
    new-instance p0, Lyf8;

    .line 172
    .line 173
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    const/4 v4, 0x1

    .line 178
    invoke-virtual/range {v2 .. v10}, Le72;->b(Lokhttp3/Request;ZJLjava/net/Proxy;Ljava/util/HashMap;Ljava/lang/String;Z)Lokhttp3/Response;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-direct {p0, p1, v1, v11}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :catchall_2
    move-exception v0

    .line 187
    move-object p0, v0

    .line 188
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 189
    .line 190
    if-nez p1, :cond_8

    .line 191
    .line 192
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 193
    .line 194
    if-nez p1, :cond_8

    .line 195
    .line 196
    new-instance p1, Lrj6;

    .line 197
    .line 198
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    move-object p0, p1

    .line 202
    :goto_4
    invoke-static {p0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-nez p1, :cond_6

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_6
    new-instance p0, Lyf8;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-nez v0, :cond_7

    .line 216
    .line 217
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-nez v0, :cond_7

    .line 222
    .line 223
    move-object v0, v1

    .line 224
    :cond_7
    invoke-direct {p0, v11, v0, p1}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :goto_5
    check-cast p0, Lyf8;

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_8
    throw p0

    .line 231
    :cond_9
    move-object p0, v11

    .line 232
    :goto_6
    if-nez p0, :cond_b

    .line 233
    .line 234
    new-instance p0, Lyf8;

    .line 235
    .line 236
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    if-nez p1, :cond_a

    .line 241
    .line 242
    goto :goto_7

    .line 243
    :cond_a
    move-object v1, p1

    .line 244
    :goto_7
    invoke-direct {p0, v11, v1, v12}, Lyf8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_b
    move-object v0, p0

    .line 248
    :goto_8
    return-object v0

    .line 249
    :cond_c
    throw v0
.end method
