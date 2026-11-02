.class public final Lq40;
.super Lqj6;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public Z:Loh7;

.field public f0:Lbq5;

.field public g0:J

.field public h0:B

.field public synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Lb71;

.field public final synthetic k0:Ljc8;


# direct methods
.method public constructor <init>(Lb71;Ljc8;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq40;->j0:Lb71;

    .line 2
    .line 3
    iput-object p2, p0, Lq40;->k0:Ljc8;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lqj6;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbz7;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lq40;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lq40;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lq40;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance v0, Lq40;

    .line 2
    .line 3
    iget-object v1, p0, Lq40;->j0:Lb71;

    .line 4
    .line 5
    iget-object p0, p0, Lq40;->k0:Ljc8;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lq40;-><init>(Lb71;Ljc8;Lq51;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, v0, Lq40;->i0:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, Lq40;->h0:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    sget-object v5, Lc71;->X:Lc71;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    if-eq v0, v3, :cond_2

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lq40;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Loh7;

    .line 20
    .line 21
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_6

    .line 25
    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :cond_1
    iget-object v0, p0, Lq40;->f0:Lbq5;

    .line 36
    .line 37
    iget-object v1, p0, Lq40;->Z:Loh7;

    .line 38
    .line 39
    iget-object v6, p0, Lq40;->i0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v6, Lbz7;

    .line 42
    .line 43
    :try_start_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcq5; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :catchall_1
    move-exception p1

    .line 49
    move-object p0, v1

    .line 50
    goto/16 :goto_7

    .line 51
    .line 52
    :catch_0
    move-object v8, v0

    .line 53
    move-object v0, v1

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_2
    iget-wide v6, p0, Lq40;->g0:J

    .line 57
    .line 58
    iget-object v0, p0, Lq40;->f0:Lbq5;

    .line 59
    .line 60
    iget-object v8, p0, Lq40;->Z:Loh7;

    .line 61
    .line 62
    iget-object v9, p0, Lq40;->i0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v9, Lbz7;

    .line 65
    .line 66
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v10, v8

    .line 70
    move-object v8, v0

    .line 71
    move-object v0, v10

    .line 72
    move-wide v11, v6

    .line 73
    move-object v6, v9

    .line 74
    :goto_0
    move-wide v9, v11

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lq40;->i0:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Lbz7;

    .line 82
    .line 83
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1}, Lbz7;->c()Lfw8;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    invoke-interface {v6}, Lfw8;->b()J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    iput-object p1, p0, Lq40;->i0:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v0, p0, Lq40;->Z:Loh7;

    .line 100
    .line 101
    sget-object v8, Lbq5;->X:Lbq5;

    .line 102
    .line 103
    iput-object v8, p0, Lq40;->f0:Lbq5;

    .line 104
    .line 105
    iput-wide v6, p0, Lq40;->g0:J

    .line 106
    .line 107
    iput-byte v3, p0, Lq40;->h0:B

    .line 108
    .line 109
    invoke-static {p1, p0, v3}, Lq18;->b(Lbz7;Lr10;I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    if-ne v9, v5, :cond_4

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_4
    move-wide v11, v6

    .line 117
    move-object v6, p1

    .line 118
    move-object p1, v9

    .line 119
    goto :goto_0

    .line 120
    :goto_1
    check-cast p1, Lhq5;

    .line 121
    .line 122
    iget p1, p1, Lhq5;->i:I

    .line 123
    .line 124
    if-ne p1, v3, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    if-ne p1, v2, :cond_9

    .line 128
    .line 129
    :goto_2
    :try_start_2
    new-instance p1, Lp40;

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    invoke-direct {p1, v8, v4, v7}, Lp40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 133
    .line 134
    .line 135
    iput-object v6, p0, Lq40;->i0:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v0, p0, Lq40;->Z:Loh7;

    .line 138
    .line 139
    iput-object v8, p0, Lq40;->f0:Lbq5;

    .line 140
    .line 141
    iput-byte v1, p0, Lq40;->h0:B

    .line 142
    .line 143
    invoke-virtual {v6, v9, v10, p1, p0}, Lbz7;->d(JLrn2;Lr10;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0
    :try_end_2
    .catch Lcq5; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 147
    if-ne p0, v5, :cond_6

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_6
    move-object v1, v0

    .line 151
    :goto_3
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v4, p0}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_8

    .line 160
    :catchall_2
    move-exception p1

    .line 161
    move-object p0, v0

    .line 162
    goto :goto_7

    .line 163
    :catch_1
    :goto_4
    :try_start_3
    iget-object p1, p0, Lq40;->j0:Lb71;

    .line 164
    .line 165
    sget-object v1, Le71;->f0:Le71;

    .line 166
    .line 167
    new-instance v7, Lbv;

    .line 168
    .line 169
    iget-object v9, p0, Lq40;->k0:Ljc8;

    .line 170
    .line 171
    invoke-direct {v7, v0, v9, v4, v3}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1, v4, v1, v7, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 175
    .line 176
    .line 177
    iput-object v0, p0, Lq40;->i0:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v4, p0, Lq40;->Z:Loh7;

    .line 180
    .line 181
    iput-object v4, p0, Lq40;->f0:Lbq5;

    .line 182
    .line 183
    iput-byte v2, p0, Lq40;->h0:B

    .line 184
    .line 185
    invoke-static {v6, v8, p0}, Lq18;->i(Lbz7;Lbq5;Lr10;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 189
    if-ne p1, v5, :cond_7

    .line 190
    .line 191
    :goto_5
    return-object v5

    .line 192
    :cond_7
    move-object p0, v0

    .line 193
    :goto_6
    :try_start_4
    check-cast p1, Lhq5;

    .line 194
    .line 195
    if-eqz p1, :cond_8

    .line 196
    .line 197
    invoke-virtual {p1}, Lhq5;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 198
    .line 199
    .line 200
    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v4, p1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_8

    .line 209
    :goto_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v4, v0}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :cond_9
    :goto_8
    sget-object p0, Ldn8;->a:Ldn8;

    .line 219
    .line 220
    return-object p0
.end method
