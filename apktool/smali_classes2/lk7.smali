.class public final Llk7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lok7;


# direct methods
.method public synthetic constructor <init>(Lok7;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Llk7;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Llk7;->i0:Lok7;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Llk7;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Llk7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Llk7;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Llk7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Llk7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Llk7;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Llk7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p2, p1}, Llk7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Llk7;

    .line 39
    .line 40
    invoke-virtual {p0, v1}, Llk7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_2
    invoke-virtual {p0, p2, p1}, Llk7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Llk7;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Llk7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lc71;->X:Lc71;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Llk7;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Llk7;->i0:Lok7;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Llk7;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p2, p0, p1, v0}, Llk7;-><init>(Lok7;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Llk7;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p2, p0, p1, v0}, Llk7;-><init>(Lok7;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_1
    new-instance p2, Llk7;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p2, p0, p1, v0}, Llk7;-><init>(Lok7;Lq51;B)V

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :pswitch_2
    new-instance p2, Llk7;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p2, p0, p1, v0}, Llk7;-><init>(Lok7;Lq51;B)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Llk7;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Llk7;->i0:Lok7;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lc71;->X:Lc71;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Llk7;->h0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v6

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Llk7;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-direct {p1, v2, v6, v0}, Llk7;-><init>(Lok7;Lq51;B)V

    .line 38
    .line 39
    .line 40
    iput-boolean v5, p0, Llk7;->h0:Z

    .line 41
    .line 42
    invoke-static {v2, p1, p0}, Lu15;->L(Ld94;Lrn2;Lq51;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v4, :cond_2

    .line 47
    .line 48
    move-object v1, v4

    .line 49
    :cond_2
    :goto_0
    return-object v1

    .line 50
    :pswitch_0
    iget-boolean v0, p0, Llk7;->h0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    if-ne v0, v5, :cond_3

    .line 55
    .line 56
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v1, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lok7;->Y()Lqk7;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object p1, p1, Lqk7;->d:Lh76;

    .line 73
    .line 74
    new-instance v0, Lo;

    .line 75
    .line 76
    const/16 v3, 0x17

    .line 77
    .line 78
    invoke-direct {v0, p1, v3}, Lo;-><init>(Lxe2;B)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Li74;

    .line 82
    .line 83
    invoke-direct {p1, v2, v6}, Li74;-><init>(Lok7;Lq51;)V

    .line 84
    .line 85
    .line 86
    iput-boolean v5, p0, Llk7;->h0:Z

    .line 87
    .line 88
    invoke-static {v0, p1, p0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v4, :cond_5

    .line 93
    .line 94
    move-object v1, v4

    .line 95
    :cond_5
    :goto_1
    return-object v1

    .line 96
    :pswitch_1
    iget-boolean v0, p0, Llk7;->h0:Z

    .line 97
    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    if-ne v0, v5, :cond_6

    .line 101
    .line 102
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    move-object v1, v6

    .line 110
    goto :goto_2

    .line 111
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance p1, Llk7;

    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    invoke-direct {p1, v2, v6, v0}, Llk7;-><init>(Lok7;Lq51;B)V

    .line 118
    .line 119
    .line 120
    iput-boolean v5, p0, Llk7;->h0:Z

    .line 121
    .line 122
    invoke-static {v2, p1, p0}, Lu15;->L(Ld94;Lrn2;Lq51;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v4, :cond_8

    .line 127
    .line 128
    move-object v1, v4

    .line 129
    :cond_8
    :goto_2
    return-object v1

    .line 130
    :pswitch_2
    iget-boolean v0, p0, Llk7;->h0:Z

    .line 131
    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    if-eq v0, v5, :cond_9

    .line 135
    .line 136
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    move-object v4, v6

    .line 140
    goto :goto_5

    .line 141
    :cond_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_a
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Lok7;->Y()Lqk7;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iget-object p1, p1, Lqk7;->d:Lh76;

    .line 153
    .line 154
    new-instance v0, Lar6;

    .line 155
    .line 156
    const/4 v1, 0x6

    .line 157
    invoke-direct {v0, v2, v6, v1}, Lar6;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iput-boolean v5, p0, Llk7;->h0:Z

    .line 164
    .line 165
    invoke-static {p1, v0, p0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-ne p0, v4, :cond_b

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_b
    :goto_4
    const-string p0, "SharedFlow never completes, this call should never return."

    .line 173
    .line 174
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :goto_5
    return-object v4

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
