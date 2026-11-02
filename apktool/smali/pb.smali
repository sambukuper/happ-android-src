.class public final synthetic Lpb;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ldn2;


# direct methods
.method public synthetic constructor <init>(Ldn2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lpb;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lpb;->Y:Ldn2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lpb;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lpb;->Y:Ldn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
