.class public final synthetic Lgx0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lme6;

.field public final synthetic Z:Lte6;


# direct methods
.method public synthetic constructor <init>(Lme6;Lte6;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lgx0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lgx0;->Y:Lme6;

    .line 4
    .line 5
    iput-object p2, p0, Lgx0;->Z:Lte6;

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
    .locals 1

    .line 1
    iget-byte v0, p0, Lgx0;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgx0;->Y:Lme6;

    .line 7
    .line 8
    iget-object p0, p0, Lgx0;->Z:Lte6;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Lme6;->R(Lte6;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lgx0;->Y:Lme6;

    .line 15
    .line 16
    iget-object p0, p0, Lgx0;->Z:Lte6;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lme6;->m(Lte6;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, Lgx0;->Y:Lme6;

    .line 23
    .line 24
    iget-object p0, p0, Lgx0;->Z:Lte6;

    .line 25
    .line 26
    invoke-interface {v0, p0}, Lme6;->u(Lte6;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
