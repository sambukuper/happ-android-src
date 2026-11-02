.class public final Lvj0;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lwj0;


# direct methods
.method public synthetic constructor <init>(Lwj0;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lvj0;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lvj0;->i0:Lwj0;

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
    iget-byte v0, p0, Lvj0;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lvj0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lvj0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lvj0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lvj0;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lvj0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lvj0;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Lvj0;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lvj0;->i0:Lwj0;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lvj0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lvj0;-><init>(Lwj0;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lvj0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lvj0;-><init>(Lwj0;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lvj0;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lvj0;->i0:Lwj0;

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
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lvj0;->h0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lvj0;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p1, v1, v5, v0}, Lvj0;-><init>(Lwj0;Lq51;B)V

    .line 36
    .line 37
    .line 38
    iput-boolean v4, p0, Lvj0;->h0:Z

    .line 39
    .line 40
    const-wide/16 v0, 0xbb8

    .line 41
    .line 42
    invoke-static {v0, v1, p1, p0}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v3, :cond_2

    .line 47
    .line 48
    move-object p1, v3

    .line 49
    :cond_2
    :goto_0
    return-object p1

    .line 50
    :pswitch_0
    iget-boolean v0, p0, Lvj0;->h0:Z

    .line 51
    .line 52
    sget-object v6, Ldn8;->a:Ldn8;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    if-ne v0, v4, :cond_3

    .line 57
    .line 58
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object v3, v5

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, v1, Lwj0;->a:Lbm3;

    .line 71
    .line 72
    iput-boolean v4, p0, Lvj0;->h0:Z

    .line 73
    .line 74
    invoke-interface {p1, v5}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {p1, p0}, Lbm3;->V0(Ls51;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, v3, :cond_5

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    move-object p0, v6

    .line 85
    :goto_1
    if-ne p0, v3, :cond_6

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    :goto_2
    move-object v3, v6

    .line 89
    :goto_3
    return-object v3

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
