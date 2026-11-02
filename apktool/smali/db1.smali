.class public final Ldb1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public synthetic i0:Z

.field public final synthetic j0:Lib1;

.field public final synthetic k0:I

.field public l0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lib1;ILq51;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Ldb1;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Ldb1;->j0:Lib1;

    .line 4
    .line 5
    iput p2, p0, Ldb1;->k0:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Ldb1;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, p1}, Ldb1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldb1;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ldb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ldb1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ldb1;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ldb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    iget-byte v0, p0, Ldb1;->g0:B

    .line 2
    .line 3
    iget v1, p0, Ldb1;->k0:I

    .line 4
    .line 5
    iget-object p0, p0, Ldb1;->j0:Lib1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Ldb1;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p1, v2}, Ldb1;-><init>(Lib1;ILq51;B)V

    .line 14
    .line 15
    .line 16
    check-cast p2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iput-boolean p0, v0, Ldb1;->i0:Z

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    new-instance v0, Ldb1;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p0, v1, p1, v2}, Ldb1;-><init>(Lib1;ILq51;B)V

    .line 29
    .line 30
    .line 31
    check-cast p2, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    iput-boolean p0, v0, Ldb1;->i0:Z

    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Ldb1;->g0:B

    .line 2
    .line 3
    iget v1, p0, Ldb1;->k0:I

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lc71;->X:Lc71;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v6, p0, Ldb1;->j0:Lib1;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-byte v0, p0, Ldb1;->h0:B

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    if-eq v0, v4, :cond_1

    .line 22
    .line 23
    if-ne v0, v5, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Ldb1;->l0:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v3, v7

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    iget-boolean v0, p0, Ldb1;->i0:Z

    .line 37
    .line 38
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v0, p0, Ldb1;->i0:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Ldb1;->i0:Z

    .line 48
    .line 49
    iput-byte v4, p0, Ldb1;->h0:B

    .line 50
    .line 51
    iget-object p1, v6, Lib1;->l0:Lvz7;

    .line 52
    .line 53
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lp92;

    .line 58
    .line 59
    new-instance v2, Lta1;

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    invoke-direct {v2, v4, v7}, Lta1;-><init>(ILq51;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2, p0}, Lp92;->a(Lta1;Ls51;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v3, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    :goto_0
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-virtual {v6}, Lib1;->b()Lja7;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object p1, p0, Ldb1;->l0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-byte v5, p0, Ldb1;->h0:B

    .line 81
    .line 82
    invoke-virtual {v0}, Lja7;->a()Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v3, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v8, p1

    .line 90
    move-object p1, p0

    .line 91
    move-object p0, v8

    .line 92
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    move-object p1, p0

    .line 99
    :cond_5
    new-instance v3, Lv91;

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    const/4 p0, 0x0

    .line 109
    :goto_2
    invoke-direct {v3, p0, v1, p1}, Lv91;-><init>(IILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :goto_3
    return-object v3

    .line 113
    :pswitch_0
    iget-byte v0, p0, Ldb1;->h0:B

    .line 114
    .line 115
    if-eqz v0, :cond_9

    .line 116
    .line 117
    if-eq v0, v4, :cond_8

    .line 118
    .line 119
    if-ne v0, v5, :cond_7

    .line 120
    .line 121
    iget-boolean v0, p0, Ldb1;->i0:Z

    .line 122
    .line 123
    iget-object p0, p0, Ldb1;->l0:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Ljava/lang/Throwable;

    .line 126
    .line 127
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_7
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v3, v7

    .line 135
    goto :goto_8

    .line 136
    :cond_8
    iget-boolean v0, p0, Ldb1;->i0:Z

    .line 137
    .line 138
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :catchall_0
    move-exception p1

    .line 143
    goto :goto_5

    .line 144
    :cond_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-boolean v0, p0, Ldb1;->i0:Z

    .line 148
    .line 149
    :try_start_1
    iput-boolean v0, p0, Ldb1;->i0:Z

    .line 150
    .line 151
    iput-byte v4, p0, Ldb1;->h0:B

    .line 152
    .line 153
    invoke-virtual {v6, v0, p0}, Lib1;->g(ZLs51;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v3, :cond_a

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_a
    :goto_4
    check-cast p1, Lhh7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :goto_5
    if-eqz v0, :cond_c

    .line 164
    .line 165
    invoke-virtual {v6}, Lib1;->b()Lja7;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iput-object p1, p0, Ldb1;->l0:Ljava/lang/Object;

    .line 170
    .line 171
    iput-boolean v0, p0, Ldb1;->i0:Z

    .line 172
    .line 173
    iput-byte v5, p0, Ldb1;->h0:B

    .line 174
    .line 175
    invoke-virtual {v1}, Lja7;->a()Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-ne p0, v3, :cond_b

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_b
    move-object v8, p1

    .line 183
    move-object p1, p0

    .line 184
    move-object p0, v8

    .line 185
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    move-object p1, p0

    .line 192
    :cond_c
    new-instance p0, Lu66;

    .line 193
    .line 194
    invoke-direct {p0, p1, v1}, Lu66;-><init>(Ljava/lang/Throwable;I)V

    .line 195
    .line 196
    .line 197
    move-object p1, p0

    .line 198
    :goto_7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    new-instance v3, Lqg5;

    .line 203
    .line 204
    invoke-direct {v3, p1, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_8
    return-object v3

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
