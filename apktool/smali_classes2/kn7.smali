.class public final synthetic Lkn7;
.super Lno2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, Lkn7;->X:B

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lmo2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Lkn7;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnd0;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Leq6;

    .line 9
    .line 10
    invoke-virtual {p0}, Leq6;->f()Ljava/util/List;

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
    check-cast p0, Low2;

    .line 18
    .line 19
    invoke-virtual {p0}, Low2;->a()V

    .line 20
    .line 21
    .line 22
    sget-object p0, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
