.class public final Lfg2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lea6;


# direct methods
.method public synthetic constructor <init>(Lea6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lfg2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lfg2;->Y:Lea6;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p2, p0, Lfg2;->X:B

    .line 2
    .line 3
    iget-object v0, p0, Lfg2;->Y:Lea6;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget-object p0, v0, Lea6;->X:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 17
    .line 18
    iget-object p2, p0, Lsu/happ/proxyutility/feature/main/MainViewModel;->C:Loh7;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Loh7;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    move-object p1, p0

    .line 25
    check-cast p1, Ljava/lang/Long;

    .line 26
    .line 27
    new-instance p1, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p0, p1}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    sget-object p0, Ldn8;->a:Ldn8;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iput-object p1, v0, Lea6;->X:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance p1, Lh;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Lh;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :pswitch_1
    iput-object p1, v0, Lea6;->X:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p1, Lh;

    .line 52
    .line 53
    invoke-direct {p1, p0}, Lh;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
