.class public final Lfh1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public synthetic i0:I

.field public final synthetic j0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgh1;Lq51;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lfh1;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lfh1;->j0:Ljava/lang/Object;

    .line 5
    .line 6
    iput p3, p0, Lfh1;->i0:I

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ln48;Lq51;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, Lfh1;->g0:B

    .line 14
    iput-object p1, p0, Lfh1;->j0:Ljava/lang/Object;

    invoke-direct {p0, v0, p2}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public constructor <init>(Lw64;ILq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lfh1;->g0:B

    .line 13
    iput-object p1, p0, Lfh1;->j0:Ljava/lang/Object;

    iput p2, p0, Lfh1;->i0:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lfh1;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    check-cast p2, Lq51;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p2, p1}, Lfh1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lfh1;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lfh1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Lb71;

    .line 32
    .line 33
    check-cast p2, Lq51;

    .line 34
    .line 35
    invoke-virtual {p0, p2, p1}, Lfh1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lfh1;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lfh1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, Lb71;

    .line 47
    .line 48
    check-cast p2, Lq51;

    .line 49
    .line 50
    invoke-virtual {p0, p2, p1}, Lfh1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lfh1;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lfh1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lfh1;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lfh1;->j0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lfh1;

    .line 9
    .line 10
    check-cast v1, Ln48;

    .line 11
    .line 12
    invoke-direct {p0, v1, p1}, Lfh1;-><init>(Ln48;Lq51;)V

    .line 13
    .line 14
    .line 15
    check-cast p2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lfh1;->i0:I

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    new-instance p2, Lfh1;

    .line 25
    .line 26
    check-cast v1, Lw64;

    .line 27
    .line 28
    iget p0, p0, Lfh1;->i0:I

    .line 29
    .line 30
    invoke-direct {p2, v1, p0, p1}, Lfh1;-><init>(Lw64;ILq51;)V

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    :pswitch_1
    new-instance p2, Lfh1;

    .line 35
    .line 36
    check-cast v1, Lgh1;

    .line 37
    .line 38
    iget p0, p0, Lfh1;->i0:I

    .line 39
    .line 40
    invoke-direct {p2, v1, p1, p0}, Lfh1;-><init>(Lgh1;Lq51;I)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lfh1;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lfh1;->j0:Ljava/lang/Object;

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
    iget-boolean v0, p0, Lfh1;->h0:Z

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
    goto :goto_1

    .line 26
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v6

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lfh1;->i0:I

    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-ne p1, v5, :cond_3

    .line 41
    .line 42
    check-cast v2, Ln48;

    .line 43
    .line 44
    iget-object p1, v2, Ln48;->D0:Lo8;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iput-boolean v5, p0, Lfh1;->h0:Z

    .line 49
    .line 50
    new-instance v0, Lk;

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    invoke-direct {v0, p1, v6, v2}, Lk;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0, p0}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v4, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object p0, v1

    .line 64
    :goto_0
    if-ne p0, v4, :cond_3

    .line 65
    .line 66
    move-object v1, v4

    .line 67
    :cond_3
    :goto_1
    return-object v1

    .line 68
    :pswitch_0
    iget-boolean v0, p0, Lfh1;->h0:Z

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    if-ne v0, v5, :cond_4

    .line 73
    .line 74
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v1, v6

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    check-cast v2, Lw64;

    .line 87
    .line 88
    iget-object p1, v2, Lw64;->r0:Ls64;

    .line 89
    .line 90
    iget v0, p0, Lfh1;->i0:I

    .line 91
    .line 92
    iput-boolean v5, p0, Lfh1;->h0:Z

    .line 93
    .line 94
    iget-object p1, p1, Ls64;->b:Lj74;

    .line 95
    .line 96
    invoke-static {p1, v0, p0}, Lj74;->f(Lj74;ILq51;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, v4, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    move-object p0, v1

    .line 104
    :goto_2
    if-ne p0, v4, :cond_7

    .line 105
    .line 106
    move-object v1, v4

    .line 107
    :cond_7
    :goto_3
    return-object v1

    .line 108
    :pswitch_1
    iget-boolean v0, p0, Lfh1;->h0:Z

    .line 109
    .line 110
    if-eqz v0, :cond_9

    .line 111
    .line 112
    if-ne v0, v5, :cond_8

    .line 113
    .line 114
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move-object p1, v6

    .line 122
    goto :goto_4

    .line 123
    :cond_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    check-cast v2, Lgh1;

    .line 127
    .line 128
    invoke-virtual {v2}, Lgh1;->j()Lwq8;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iget v0, p0, Lfh1;->i0:I

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Lwq8;->d(I)Lxg1;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-boolean v5, p0, Lfh1;->h0:Z

    .line 139
    .line 140
    check-cast p1, Lux0;

    .line 141
    .line 142
    invoke-virtual {p1, p0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-ne p1, v4, :cond_a

    .line 147
    .line 148
    move-object p1, v4

    .line 149
    :cond_a
    :goto_4
    return-object p1

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
