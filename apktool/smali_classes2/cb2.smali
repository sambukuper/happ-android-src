.class public final Lcb2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public final synthetic h0:Lea6;


# direct methods
.method public synthetic constructor <init>(Lea6;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lcb2;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lcb2;->h0:Lea6;

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
    iget-byte v0, p0, Lcb2;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lcb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcb2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p2, p1}, Lcb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcb2;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lcb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :pswitch_1
    check-cast p1, Ldn8;

    .line 39
    .line 40
    check-cast p2, Lq51;

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Lcb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lcb2;

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lcb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :pswitch_2
    check-cast p1, Lb71;

    .line 53
    .line 54
    check-cast p2, Lq51;

    .line 55
    .line 56
    invoke-virtual {p0, p2, p1}, Lcb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lcb2;

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lcb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_3
    check-cast p1, Lb71;

    .line 67
    .line 68
    check-cast p2, Lq51;

    .line 69
    .line 70
    invoke-virtual {p0, p2, p1}, Lcb2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lcb2;

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lcb2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Lcb2;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lcb2;->h0:Lea6;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lcb2;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lcb2;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_1
    new-instance p2, Lcb2;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p2, p0, p1, v0}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :pswitch_2
    new-instance p2, Lcb2;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p2, p0, p1, v0}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :pswitch_3
    new-instance p2, Lcb2;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p2, p0, p1, v0}, Lcb2;-><init>(Lea6;Lq51;B)V

    .line 40
    .line 41
    .line 42
    return-object p2

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lcb2;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object p0, p0, Lcb2;->h0:Lea6;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Llibxray/XRayPoint;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Llibxray/XRayPoint;->getIsRunning()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Llibxray/XRayPoint;->coreStopLoop()V

    .line 28
    .line 29
    .line 30
    :cond_0
    move-object v2, v3

    .line 31
    :cond_1
    return-object v2

    .line 32
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Llibxray/XRayPoint;

    .line 38
    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Llibxray/XRayPoint;->getIsRunning()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Llibxray/XRayPoint;->coreStopLoop()V

    .line 48
    .line 49
    .line 50
    :cond_2
    move-object v2, v3

    .line 51
    :cond_3
    return-object v2

    .line 52
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, Lea6;->X:Ljava/lang/Object;

    .line 56
    .line 57
    return-object v3

    .line 58
    :pswitch_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Llibxray/XRayPoint;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Llibxray/XRayPoint;->getIsRunning()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    .line 73
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast p0, Llibxray/XRayPoint;

    .line 79
    .line 80
    invoke-virtual {p0}, Llibxray/XRayPoint;->coreStopLoop()V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-object v3

    .line 84
    :pswitch_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lea6;->X:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Llibxray/XRayPoint;

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Llibxray/XRayPoint;->getIsRunning()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-ne p1, v1, :cond_5

    .line 98
    .line 99
    iget-object p0, p0, Lea6;->X:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast p0, Llibxray/XRayPoint;

    .line 105
    .line 106
    invoke-virtual {p0}, Llibxray/XRayPoint;->coreStopLoop()V

    .line 107
    .line 108
    .line 109
    :cond_5
    return-object v3

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
