.class public final Lgf2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public final synthetic i0:J

.field public synthetic j0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLbz7;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lgf2;->g0:B

    .line 3
    .line 4
    iput-wide p1, p0, Lgf2;->i0:J

    .line 5
    .line 6
    iput-object p3, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(JLq51;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lgf2;->g0:B

    .line 13
    iput-wide p1, p0, Lgf2;->i0:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lgf2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lb71;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lgf2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lgf2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lgf2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lkv5;

    .line 24
    .line 25
    check-cast p2, Lq51;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lgf2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lgf2;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lgf2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object p0, Lc71;->X:Lc71;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 3

    .line 1
    iget-byte v0, p0, Lgf2;->g0:B

    .line 2
    .line 3
    iget-wide v1, p0, Lgf2;->i0:J

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lgf2;

    .line 9
    .line 10
    iget-object p0, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lbz7;

    .line 13
    .line 14
    invoke-direct {p2, v1, v2, p0, p1}, Lgf2;-><init>(JLbz7;Lq51;)V

    .line 15
    .line 16
    .line 17
    return-object p2

    .line 18
    :pswitch_0
    new-instance p0, Lgf2;

    .line 19
    .line 20
    invoke-direct {p0, v1, v2, p1}, Lgf2;-><init>(JLq51;)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lgf2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    sget-object v4, Lc71;->X:Lc71;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    iget-wide v7, p0, Lgf2;->i0:J

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-byte v0, p0, Lgf2;->h0:B

    .line 18
    .line 19
    const-wide/16 v9, 0x8

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    if-eq v0, v5, :cond_1

    .line 24
    .line 25
    if-ne v0, v6, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v2

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sub-long v2, v7, v9

    .line 44
    .line 45
    iput-byte v5, p0, Lgf2;->h0:B

    .line 46
    .line 47
    invoke-static {v2, v3, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v4, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    :goto_0
    iput-byte v6, p0, Lgf2;->h0:B

    .line 55
    .line 56
    invoke-static {v9, v10, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v4, :cond_4

    .line 61
    .line 62
    :goto_1
    move-object v1, v4

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    :goto_2
    iget-object p0, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lbz7;

    .line 67
    .line 68
    iget-object p0, p0, Lbz7;->Z:Lmm0;

    .line 69
    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    new-instance p1, Lcq5;

    .line 73
    .line 74
    invoke-direct {p1, v7, v8}, Lcq5;-><init>(J)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Lrj6;

    .line 78
    .line 79
    invoke-direct {v0, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lmm0;->f(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_3
    return-object v1

    .line 86
    :pswitch_0
    iget-object v0, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lkv5;

    .line 89
    .line 90
    iget-byte v9, p0, Lgf2;->h0:B

    .line 91
    .line 92
    const/4 v10, 0x3

    .line 93
    if-eqz v9, :cond_9

    .line 94
    .line 95
    if-eq v9, v5, :cond_8

    .line 96
    .line 97
    if-eq v9, v6, :cond_7

    .line 98
    .line 99
    if-ne v9, v10, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_8

    .line 106
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_8
    :goto_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 118
    .line 119
    iput-byte v5, p0, Lgf2;->h0:B

    .line 120
    .line 121
    invoke-static {v7, v8, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v4, :cond_a

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_a
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 132
    .line 133
    iput-byte v6, p0, Lgf2;->h0:B

    .line 134
    .line 135
    iget-object p1, v0, Lkv5;->g0:Lx90;

    .line 136
    .line 137
    invoke-interface {p1, p0, v1}, Ln17;->a(Lq51;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v4, :cond_b

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_b
    :goto_6
    iput-object v0, p0, Lgf2;->j0:Ljava/lang/Object;

    .line 145
    .line 146
    iput-byte v10, p0, Lgf2;->h0:B

    .line 147
    .line 148
    invoke-static {v7, v8, p0}, Lu70;->F(JLq51;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-ne p1, v4, :cond_a

    .line 153
    .line 154
    :goto_7
    move-object v2, v4

    .line 155
    :goto_8
    return-object v2

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
