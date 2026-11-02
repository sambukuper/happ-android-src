.class public final Lo40;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Ljc8;


# direct methods
.method public synthetic constructor <init>(Ljc8;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lo40;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lo40;->i0:Ljc8;

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
    iget-byte v0, p0, Lo40;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lo40;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lo40;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lo40;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lb71;

    .line 24
    .line 25
    check-cast p2, Lq51;

    .line 26
    .line 27
    invoke-virtual {p0, p2, p1}, Lo40;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lo40;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lo40;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    check-cast p2, Lq51;

    .line 44
    .line 45
    invoke-virtual {p0, p2, p1}, Lo40;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lo40;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Lo40;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_2
    check-cast p1, Lb71;

    .line 56
    .line 57
    check-cast p2, Lq51;

    .line 58
    .line 59
    invoke-virtual {p0, p2, p1}, Lo40;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lo40;

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lo40;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte v0, p0, Lo40;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lo40;->i0:Ljc8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lo40;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lo40;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_1
    new-instance v0, Lo40;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p1, v1}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 26
    .line 27
    .line 28
    check-cast p2, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, Lo40;->h0:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance p2, Lo40;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p2, p0, p1, v0}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Lo40;->g0:B

    .line 2
    .line 3
    sget-object v1, Lf15;->X:Lf15;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    sget-object v5, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget-object v6, p0, Lo40;->i0:Ljc8;

    .line 12
    .line 13
    sget-object v7, Lc71;->X:Lc71;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lo40;->h0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v4, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-boolean v4, p0, Lo40;->h0:Z

    .line 36
    .line 37
    invoke-virtual {v6, v1, p0}, Ljc8;->c(Lf15;Luy7;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-ne p0, v7, :cond_2

    .line 42
    .line 43
    move-object v2, v7

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    move-object v2, v5

    .line 46
    :goto_1
    return-object v2

    .line 47
    :pswitch_0
    iget-boolean v0, p0, Lo40;->h0:Z

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    if-ne v0, v4, :cond_3

    .line 52
    .line 53
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v4, p0, Lo40;->h0:Z

    .line 65
    .line 66
    sget-object p1, Lf15;->Y:Lf15;

    .line 67
    .line 68
    invoke-virtual {v6, p1, p0}, Ljc8;->c(Lf15;Luy7;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v7, :cond_5

    .line 73
    .line 74
    move-object v2, v7

    .line 75
    goto :goto_3

    .line 76
    :cond_5
    :goto_2
    move-object v2, v5

    .line 77
    :goto_3
    return-object v2

    .line 78
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-boolean p0, p0, Lo40;->h0:Z

    .line 82
    .line 83
    if-nez p0, :cond_6

    .line 84
    .line 85
    invoke-virtual {v6}, Ljc8;->a()V

    .line 86
    .line 87
    .line 88
    :cond_6
    return-object v5

    .line 89
    :pswitch_2
    iget-boolean v0, p0, Lo40;->h0:Z

    .line 90
    .line 91
    if-eqz v0, :cond_8

    .line 92
    .line 93
    if-ne v0, v4, :cond_7

    .line 94
    .line 95
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_7
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iput-boolean v4, p0, Lo40;->h0:Z

    .line 107
    .line 108
    invoke-virtual {v6, v1, p0}, Ljc8;->c(Lf15;Luy7;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-ne p0, v7, :cond_9

    .line 113
    .line 114
    move-object v2, v7

    .line 115
    goto :goto_5

    .line 116
    :cond_9
    :goto_4
    move-object v2, v5

    .line 117
    :goto_5
    return-object v2

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
