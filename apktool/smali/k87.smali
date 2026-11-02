.class public final synthetic Lk87;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Ldn2;

.field public final synthetic f0:Lp87;

.field public final synthetic g0:Lgn2;


# direct methods
.method public synthetic constructor <init>(ZLdn2;Ldn2;Lp87;Lgn2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lk87;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lk87;->Y:Ldn2;

    .line 7
    .line 8
    iput-object p3, p0, Lk87;->Z:Ldn2;

    .line 9
    .line 10
    iput-object p4, p0, Lk87;->f0:Lp87;

    .line 11
    .line 12
    iput-object p5, p0, Lk87;->g0:Lgn2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lo87;

    .line 2
    .line 3
    iget-boolean v1, p0, Lk87;->X:Z

    .line 4
    .line 5
    iget-object v2, p0, Lk87;->Y:Ldn2;

    .line 6
    .line 7
    iget-object v3, p0, Lk87;->Z:Ldn2;

    .line 8
    .line 9
    iget-object v4, p0, Lk87;->f0:Lp87;

    .line 10
    .line 11
    iget-object v5, p0, Lk87;->g0:Lgn2;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lo87;-><init>(ZLdn2;Ldn2;Lp87;Lgn2;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
