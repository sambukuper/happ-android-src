.class public final synthetic Lhx0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lme6;

.field public final synthetic Z:Lte6;

.field public final synthetic f0:J

.field public final synthetic g0:Lde;


# direct methods
.method public synthetic constructor <init>(Lme6;Lte6;JLde;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, Lhx0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhx0;->Y:Lme6;

    .line 4
    .line 5
    iput-object p2, p0, Lhx0;->Z:Lte6;

    .line 6
    .line 7
    iput-wide p3, p0, Lhx0;->f0:J

    .line 8
    .line 9
    iput-object p5, p0, Lhx0;->g0:Lde;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, Lhx0;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lhx0;->g0:Lde;

    .line 4
    .line 5
    iget-wide v2, p0, Lhx0;->f0:J

    .line 6
    .line 7
    iget-object v4, p0, Lhx0;->Z:Lte6;

    .line 8
    .line 9
    iget-object p0, p0, Lhx0;->Y:Lme6;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v4, v2, v3, v1}, Lme6;->Y(Lte6;JLde;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-interface {p0, v4, v2, v3, v1}, Lme6;->J(Lte6;JLde;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
