.class public final synthetic Lj63;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxj2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ln63;


# direct methods
.method public synthetic constructor <init>(Ln63;Ln63;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lj63;->X:B

    .line 2
    .line 3
    iput-object p2, p0, Lj63;->Y:Ln63;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Lyj2;)V
    .locals 0

    .line 1
    iget-byte p1, p0, Lj63;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lj63;->Y:Ln63;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, Landroidx/camera/core/ImageProcessingUtil;->a:I

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget p1, Landroidx/camera/core/ImageProcessingUtil;->a:I

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
