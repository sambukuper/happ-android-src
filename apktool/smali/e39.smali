.class public final Le39;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lg94;

.field public final synthetic Z:Lf39;


# direct methods
.method public synthetic constructor <init>(Lg94;Lf39;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Le39;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Le39;->Y:Lg94;

    .line 4
    .line 5
    iput-object p2, p0, Le39;->Z:Lf39;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, Le39;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Le39;->Z:Lf39;

    .line 4
    .line 5
    iget-object p0, p0, Le39;->Y:Lg94;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lg94;->f(Lc94;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, v1}, Lg94;->a(Lc94;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
