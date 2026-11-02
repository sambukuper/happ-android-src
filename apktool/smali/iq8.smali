.class public final synthetic Liq8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lv06;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljq8;


# direct methods
.method public synthetic constructor <init>(Ljq8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Liq8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Liq8;->Y:Ljq8;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Liq8;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Liq8;->Y:Ljq8;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ljq8;->d:Lg44;

    .line 9
    .line 10
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lli0;

    .line 15
    .line 16
    iget-object p0, p0, Lli0;->b:Ljava/util/Map;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object v0, p0, Ljq8;->a:Lgn2;

    .line 20
    .line 21
    iget-object p0, p0, Ljq8;->d:Lg44;

    .line 22
    .line 23
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lli0;

    .line 28
    .line 29
    iget-object p0, p0, Lli0;->a:Lhi0;

    .line 30
    .line 31
    invoke-interface {v0, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lqi0;

    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
