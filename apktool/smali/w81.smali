.class public final Lw81;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lgn2;Lq51;B)V
    .locals 0

    .line 10
    iput-byte p3, p0, Lw81;->g0:B

    iput-object p1, p0, Lw81;->i0:Lgn2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    return-void
.end method

.method public synthetic constructor <init>(Lq51;Lgn2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lw81;->g0:B

    .line 2
    .line 3
    iput-object p2, p0, Lw81;->i0:Lgn2;

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    invoke-direct {p0, p2, p1}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lw81;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Llq6;

    .line 9
    .line 10
    check-cast p2, Lq51;

    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lw81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lw81;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lw81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    check-cast p1, Lo05;

    .line 23
    .line 24
    check-cast p2, Lq51;

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1}, Lw81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lw81;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lw81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    check-cast p1, Lvq5;

    .line 37
    .line 38
    check-cast p2, Lq51;

    .line 39
    .line 40
    invoke-virtual {p0, p2, p1}, Lw81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lw81;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lw81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_2
    check-cast p1, Lvq5;

    .line 52
    .line 53
    check-cast p2, Lq51;

    .line 54
    .line 55
    invoke-virtual {p0, p2, p1}, Lw81;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lw81;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lw81;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
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
    iget-byte v0, p0, Lw81;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lw81;->i0:Lgn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lw81;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p1, v1}, Lw81;-><init>(Lgn2;Lq51;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, v0, Lw81;->h0:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lw81;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p1, v1}, Lw81;-><init>(Lgn2;Lq51;B)V

    .line 21
    .line 22
    .line 23
    iput-object p2, v0, Lw81;->h0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, Lw81;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p1, p0, v1}, Lw81;-><init>(Lq51;Lgn2;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, v0, Lw81;->h0:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, Lw81;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p1, p0, v1}, Lw81;-><init>(Lq51;Lgn2;B)V

    .line 39
    .line 40
    .line 41
    iput-object p2, v0, Lw81;->h0:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

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
    .locals 3

    .line 1
    iget-byte v0, p0, Lw81;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lw81;->i0:Lgn2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lw81;->h0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Llq6;

    .line 13
    .line 14
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Llq6;->a:Ljava/lang/String;

    .line 20
    .line 21
    new-instance p1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    :goto_0
    return-object v1

    .line 35
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lw81;->h0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lo05;

    .line 41
    .line 42
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lw81;->h0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lvq5;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast p0, Lo66;

    .line 57
    .line 58
    invoke-interface {p0}, Lo66;->b()Lqr6;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lw81;->h0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Lvq5;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p0, Lo66;

    .line 78
    .line 79
    invoke-interface {p0}, Lo66;->b()Lqr6;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
