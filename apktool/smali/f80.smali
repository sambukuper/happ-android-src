.class public final synthetic Lf80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lkx4;


# direct methods
.method public synthetic constructor <init>(Lkx4;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lf80;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lf80;->Y:Lkx4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lf80;->X:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x7

    .line 5
    sget-object v3, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    iget-object p0, p0, Lf80;->Y:Lkx4;

    .line 8
    .line 9
    check-cast p1, Llp2;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lw79;->P(I)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-static {p0, p1, p2}, Lg28;->a(Lkx4;Llp2;I)V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :pswitch_0
    invoke-static {v1}, Lw79;->P(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {p0, p1, p2}, Ldu7;->a(Lkx4;Llp2;I)V

    .line 32
    .line 33
    .line 34
    return-object v3

    .line 35
    :pswitch_1
    invoke-static {v1}, Lw79;->P(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, p1, p2}, Lnr4;->b(Lkx4;Llp2;I)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :pswitch_2
    invoke-static {v2}, Lw79;->P(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p0, p1, p2}, Lkm4;->f(Lkx4;Llp2;I)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :pswitch_3
    invoke-static {v2}, Lw79;->P(I)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-static {p0, p1, p2}, Lsx2;->a(Lkx4;Llp2;I)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :pswitch_4
    invoke-static {v2}, Lw79;->P(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p0, p1, p2}, Lu70;->d(Lkx4;Llp2;I)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :pswitch_5
    invoke-static {v1}, Lw79;->P(I)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {p0, p1, p2}, Lg80;->a(Lkx4;Llp2;I)V

    .line 72
    .line 73
    .line 74
    return-object v3

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
