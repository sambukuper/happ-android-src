.class public final Lww0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:Lx90;

.field public final synthetic Y:I


# direct methods
.method public constructor <init>(Lx90;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lww0;->X:Lx90;

    .line 5
    .line 6
    iput p2, p0, Lww0;->Y:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lvw0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lvw0;

    .line 7
    .line 8
    iget v1, v0, Lvw0;->h0:I

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
    iput v1, v0, Lvw0;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvw0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lvw0;-><init>(Lww0;Lq51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lvw0;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvw0;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    sget-object v3, Ldn8;->a:Ldn8;

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    sget-object v6, Lc71;->X:Lc71;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v5, :cond_2

    .line 39
    .line 40
    if-ne v1, v4, :cond_1

    .line 41
    .line 42
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lpb3;

    .line 61
    .line 62
    iget v1, p0, Lww0;->Y:I

    .line 63
    .line 64
    invoke-direct {p2, v1, p1}, Lpb3;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput v5, v0, Lvw0;->h0:I

    .line 68
    .line 69
    iget-object p0, p0, Lww0;->X:Lx90;

    .line 70
    .line 71
    invoke-interface {p0, v0, p2}, Ln17;->a(Lq51;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, v6, :cond_4

    .line 76
    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_4
    :goto_1
    iput v4, v0, Lvw0;->h0:I

    .line 80
    .line 81
    invoke-interface {v0}, Lq51;->w()Ls61;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lu70;->I(Ls61;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Lmb6;->H(Lq51;)Lq51;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    instance-of p2, p1, Lnp1;

    .line 93
    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    move-object v2, p1

    .line 97
    check-cast v2, Lnp1;

    .line 98
    .line 99
    :cond_5
    if-nez v2, :cond_6

    .line 100
    .line 101
    :goto_2
    move-object p0, v3

    .line 102
    goto :goto_6

    .line 103
    :cond_6
    iget-object p1, v2, Lnp1;->f0:Lu61;

    .line 104
    .line 105
    invoke-static {p1, p0}, Lop1;->c(Lu61;Ls61;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_7

    .line 110
    .line 111
    iput-object v3, v2, Lnp1;->h0:Ljava/lang/Object;

    .line 112
    .line 113
    iput v5, v2, Lqp1;->Z:I

    .line 114
    .line 115
    invoke-virtual {p1, p0, v2}, Lu61;->a1(Ls61;Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    new-instance p2, Lg79;

    .line 120
    .line 121
    sget-object v0, Lg79;->Z:Lf08;

    .line 122
    .line 123
    invoke-direct {p2, v0}, Lf1;-><init>(Lr61;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, p2}, Ls61;->B0(Ls61;)Ls61;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iput-object v3, v2, Lnp1;->h0:Ljava/lang/Object;

    .line 131
    .line 132
    iput v5, v2, Lqp1;->Z:I

    .line 133
    .line 134
    invoke-virtual {p1, p0, v2}, Lu61;->a1(Ls61;Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    iget-boolean p0, p2, Lg79;->Y:Z

    .line 138
    .line 139
    if-eqz p0, :cond_a

    .line 140
    .line 141
    invoke-static {}, Lj98;->a()Ld42;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    iget-object p1, p0, Ld42;->g0:Lkt;

    .line 146
    .line 147
    if-eqz p1, :cond_8

    .line 148
    .line 149
    invoke-virtual {p1}, Lkt;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    goto :goto_3

    .line 154
    :cond_8
    move p1, v5

    .line 155
    :goto_3
    if-eqz p1, :cond_9

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_9
    iget-wide p1, p0, Ld42;->Z:J

    .line 159
    .line 160
    const-wide v0, 0x100000000L

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    cmp-long p1, p1, v0

    .line 166
    .line 167
    if-ltz p1, :cond_b

    .line 168
    .line 169
    iput-object v3, v2, Lnp1;->h0:Ljava/lang/Object;

    .line 170
    .line 171
    iput v5, v2, Lqp1;->Z:I

    .line 172
    .line 173
    invoke-virtual {p0, v2}, Ld42;->e1(Lqp1;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    :goto_4
    move-object p0, v6

    .line 177
    goto :goto_6

    .line 178
    :cond_b
    invoke-virtual {p0, v5}, Ld42;->f1(Z)V

    .line 179
    .line 180
    .line 181
    :try_start_0
    invoke-virtual {v2}, Lqp1;->run()V

    .line 182
    .line 183
    .line 184
    :cond_c
    invoke-virtual {p0}, Ld42;->h1()Z

    .line 185
    .line 186
    .line 187
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    if-nez p1, :cond_c

    .line 189
    .line 190
    :goto_5
    invoke-virtual {p0, v5}, Ld42;->d1(Z)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :catchall_0
    move-exception p1

    .line 195
    :try_start_1
    invoke-virtual {v2, p1}, Lqp1;->h(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :catchall_1
    move-exception p1

    .line 200
    invoke-virtual {p0, v5}, Ld42;->d1(Z)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :goto_6
    if-ne p0, v6, :cond_d

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_d
    move-object p0, v3

    .line 208
    :goto_7
    if-ne p0, v6, :cond_e

    .line 209
    .line 210
    :goto_8
    return-object v6

    .line 211
    :cond_e
    :goto_9
    return-object v3
.end method
