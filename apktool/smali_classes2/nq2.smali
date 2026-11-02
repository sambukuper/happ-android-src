.class public final synthetic Lnq2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lpv3;

.field public final synthetic Z:Ldn2;


# direct methods
.method public synthetic constructor <init>(Lpv3;Ldn2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lnq2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lnq2;->Y:Lpv3;

    .line 4
    .line 5
    iput-object p2, p0, Lnq2;->Z:Ldn2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lnq2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lnq2;->Z:Ldn2;

    .line 6
    .line 7
    iget-object p0, p0, Lnq2;->Y:Lpv3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lgn2;

    .line 13
    .line 14
    sget-object v0, Lqv5;->a:Lqv5;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    check-cast p0, Lgn2;

    .line 24
    .line 25
    sget-object v0, Lpv5;->a:Lpv5;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    check-cast p0, Lgn2;

    .line 35
    .line 36
    sget-object v0, Luq2;->a:Luq2;

    .line 37
    .line 38
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
