.class public final synthetic Lgr5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lda6;

.field public final synthetic Y:Lir5;

.field public final synthetic Z:Llf3;

.field public final synthetic f0:J

.field public final synthetic g0:J


# direct methods
.method public synthetic constructor <init>(Lda6;Lir5;Llf3;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgr5;->X:Lda6;

    .line 5
    .line 6
    iput-object p2, p0, Lgr5;->Y:Lir5;

    .line 7
    .line 8
    iput-object p3, p0, Lgr5;->Z:Llf3;

    .line 9
    .line 10
    iput-wide p4, p0, Lgr5;->f0:J

    .line 11
    .line 12
    iput-wide p6, p0, Lgr5;->g0:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lgr5;->Y:Lir5;

    .line 2
    .line 3
    iget-object v1, v0, Lir5;->x0:Lnr5;

    .line 4
    .line 5
    iget-object v5, v0, Lir5;->y0:Lz24;

    .line 6
    .line 7
    iget-object v2, p0, Lgr5;->Z:Llf3;

    .line 8
    .line 9
    iget-wide v3, p0, Lgr5;->f0:J

    .line 10
    .line 11
    iget-wide v6, p0, Lgr5;->g0:J

    .line 12
    .line 13
    invoke-interface/range {v1 .. v7}, Lnr5;->x(Llf3;JLz24;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-object p0, p0, Lgr5;->X:Lda6;

    .line 18
    .line 19
    iput-wide v0, p0, Lda6;->X:J

    .line 20
    .line 21
    sget-object p0, Ldn8;->a:Ldn8;

    .line 22
    .line 23
    return-object p0
.end method
