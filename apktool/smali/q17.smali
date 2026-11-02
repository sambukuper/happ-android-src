.class public final Lq17;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw76;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lq17;->a:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lw76;

    .line 19
    .line 20
    const/16 v1, 0x19

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lvz7;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lq17;->b:Lvz7;

    .line 31
    .line 32
    new-instance v0, Lw76;

    .line 33
    .line 34
    const/16 v1, 0x1a

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lvz7;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lq17;->c:Lvz7;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILs51;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lp17;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lp17;

    .line 7
    .line 8
    iget v1, v0, Lp17;->l0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lp17;->l0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lp17;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lp17;-><init>(Lq17;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lp17;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lp17;->l0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lc71;->X:Lc71;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v4, :cond_2

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iget p1, v0, Lp17;->i0:I

    .line 42
    .line 43
    iget-object p2, v0, Lp17;->g0:Ljava/util/List;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_5

    .line 49
    .line 50
    :catchall_0
    move-exception p3

    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_2
    iget p1, v0, Lp17;->i0:I

    .line 60
    .line 61
    iget-short p2, v0, Lp17;->h0:S

    .line 62
    .line 63
    iget-object v1, v0, Lp17;->g0:Ljava/util/List;

    .line 64
    .line 65
    iget-object v7, v0, Lp17;->f0:Ljava/lang/String;

    .line 66
    .line 67
    :try_start_1
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast p3, Lsj6;

    .line 71
    .line 72
    iget-object p3, p3, Lsj6;->X:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    move v9, p2

    .line 75
    move p2, p1

    .line 76
    move-object p1, v7

    .line 77
    move-object v7, p3

    .line 78
    move p3, v9

    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception p3

    .line 81
    :goto_1
    move-object p2, v1

    .line 82
    goto/16 :goto_8

    .line 83
    .line 84
    :cond_3
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    sget-object p3, Lkw4;->a:Lkw4;

    .line 88
    .line 89
    invoke-static {}, Lkw4;->t()Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    :try_start_2
    iget-object v1, p0, Lq17;->a:Lvz7;

    .line 94
    .line 95
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lqo;

    .line 100
    .line 101
    iput-object p1, v0, Lp17;->f0:Ljava/lang/String;

    .line 102
    .line 103
    iput-object p3, v0, Lp17;->g0:Ljava/util/List;

    .line 104
    .line 105
    iput-short p2, v0, Lp17;->h0:S

    .line 106
    .line 107
    iput v5, v0, Lp17;->i0:I

    .line 108
    .line 109
    iput v4, v0, Lp17;->l0:I

    .line 110
    .line 111
    const/16 v7, 0x2328

    .line 112
    .line 113
    invoke-virtual {v1, p1, p3, v7, v0}, Lqo;->j(Ljava/lang/String;Ljava/util/ArrayList;ILs51;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 117
    if-ne v1, v6, :cond_4

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_4
    move-object v7, v1

    .line 121
    move-object v1, p3

    .line 122
    move p3, p2

    .line 123
    move p2, v5

    .line 124
    :goto_2
    :try_start_3
    invoke-static {v7}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    if-nez v8, :cond_5

    .line 129
    .line 130
    check-cast v7, Lqg5;

    .line 131
    .line 132
    iget-object v7, v7, Lqg5;->X:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v7, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 140
    const/16 v8, 0xc8

    .line 141
    .line 142
    if-gt v8, v7, :cond_5

    .line 143
    .line 144
    const/16 v8, 0x12c

    .line 145
    .line 146
    if-ge v7, v8, :cond_5

    .line 147
    .line 148
    move p1, p2

    .line 149
    move-object p2, v1

    .line 150
    goto :goto_6

    .line 151
    :catchall_2
    move-exception p3

    .line 152
    :goto_3
    move p1, p2

    .line 153
    goto :goto_1

    .line 154
    :cond_5
    :try_start_4
    iget-object v4, p0, Lq17;->b:Lvz7;

    .line 155
    .line 156
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Lvr1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 161
    .line 162
    :try_start_5
    iput-object v2, v0, Lp17;->f0:Ljava/lang/String;

    .line 163
    .line 164
    iput-object v1, v0, Lp17;->g0:Ljava/util/List;

    .line 165
    .line 166
    iput-short p3, v0, Lp17;->h0:S

    .line 167
    .line 168
    iput p2, v0, Lp17;->i0:I

    .line 169
    .line 170
    iput v3, v0, Lp17;->l0:I

    .line 171
    .line 172
    invoke-virtual {v4, p1, v1, v0}, Lvr1;->f(Ljava/lang/String;Ljava/util/List;Ls51;)Ljava/io/Serializable;

    .line 173
    .line 174
    .line 175
    move-result-object p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 176
    if-ne p3, v6, :cond_6

    .line 177
    .line 178
    :goto_4
    return-object v6

    .line 179
    :cond_6
    move p1, p2

    .line 180
    move-object p2, v1

    .line 181
    :goto_5
    :try_start_6
    check-cast p3, Ljava/lang/Boolean;

    .line 182
    .line 183
    if-eqz p3, :cond_7

    .line 184
    .line 185
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    goto :goto_6

    .line 190
    :cond_7
    move v4, v5

    .line 191
    :goto_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 195
    goto :goto_9

    .line 196
    :goto_7
    move-object p3, p1

    .line 197
    goto :goto_3

    .line 198
    :catchall_3
    move-exception p1

    .line 199
    goto :goto_7

    .line 200
    :catchall_4
    move-exception p1

    .line 201
    move-object p2, p3

    .line 202
    move-object p3, p1

    .line 203
    move p1, v5

    .line 204
    :goto_8
    if-eqz p1, :cond_8

    .line 205
    .line 206
    invoke-static {p3}, Lgv3;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const-string v0, "util.protection"

    .line 211
    .line 212
    invoke-static {p1, v0, v5}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-nez p1, :cond_8

    .line 217
    .line 218
    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 219
    .line 220
    .line 221
    :cond_8
    instance-of p1, p3, Ljava/lang/InterruptedException;

    .line 222
    .line 223
    if-nez p1, :cond_a

    .line 224
    .line 225
    instance-of p1, p3, Ljava/util/concurrent/CancellationException;

    .line 226
    .line 227
    if-nez p1, :cond_a

    .line 228
    .line 229
    new-instance p1, Lrj6;

    .line 230
    .line 231
    invoke-direct {p1, p3}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    :goto_9
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    instance-of v0, p1, Lrj6;

    .line 237
    .line 238
    if-eqz v0, :cond_9

    .line 239
    .line 240
    move-object p1, p3

    .line 241
    :cond_9
    check-cast p1, Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 244
    .line 245
    .line 246
    move-result p3

    .line 247
    iget-object p0, p0, Lq17;->c:Lvz7;

    .line 248
    .line 249
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    check-cast p0, Lkf4;

    .line 254
    .line 255
    new-instance v0, Lzs1;

    .line 256
    .line 257
    const/4 v1, 0x5

    .line 258
    invoke-direct {v0, p2, p3, v1}, Lzs1;-><init>(Ljava/lang/Object;ZB)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v0}, Lkf4;->g(Lgn2;)V

    .line 262
    .line 263
    .line 264
    return-object p1

    .line 265
    :cond_a
    throw p3
.end method
