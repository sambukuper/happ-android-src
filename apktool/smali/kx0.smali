.class public final synthetic Lkx0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:Lme6;

.field public final synthetic Y:Lte6;

.field public final synthetic Z:J

.field public final synthetic f0:J


# direct methods
.method public synthetic constructor <init>(Lme6;Lte6;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkx0;->X:Lme6;

    .line 5
    .line 6
    iput-object p2, p0, Lkx0;->Y:Lte6;

    .line 7
    .line 8
    iput-wide p3, p0, Lkx0;->Z:J

    .line 9
    .line 10
    iput-wide p5, p0, Lkx0;->f0:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-wide v2, p0, Lkx0;->Z:J

    .line 2
    .line 3
    iget-wide v4, p0, Lkx0;->f0:J

    .line 4
    .line 5
    iget-object v0, p0, Lkx0;->X:Lme6;

    .line 6
    .line 7
    iget-object v1, p0, Lkx0;->Y:Lte6;

    .line 8
    .line 9
    invoke-interface/range {v0 .. v5}, Lme6;->C(Lte6;JJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
