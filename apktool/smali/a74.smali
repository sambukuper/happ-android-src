.class public final synthetic La74;
.super Lnx5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljw3;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La74;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p5}, Lnx5;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final S()Lxu3;
    .locals 1

    .line 1
    sget-object v0, Lyb6;->a:Lzb6;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lzb6;->f(La74;)Ljw3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final bridge synthetic b()Lhw3;
    .locals 0

    .line 12
    invoke-virtual {p0}, La74;->b()Liw3;

    move-result-object p0

    return-object p0
.end method

.method public final b()Liw3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnx5;->W()Lnw3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljw3;

    .line 6
    .line 7
    invoke-interface {p0}, Ljw3;->b()Liw3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La74;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Llh7;

    .line 9
    .line 10
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Llh7;

    .line 18
    .line 19
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_1
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Llh7;

    .line 27
    .line 28
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_2
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Llh7;

    .line 36
    .line 37
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_3
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_4
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Llh7;

    .line 56
    .line 57
    invoke-interface {p0}, Llh7;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljw3;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
