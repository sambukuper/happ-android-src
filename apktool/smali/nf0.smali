.class public final Lnf0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final X:Ls98;

.field public final Y:Ljava/lang/String;

.field public final Z:Landroid/hardware/camera2/CameraManager;

.field public final f0:Lm51;

.field public final g0:Lpv;

.field public final h0:Loh7;

.field public final i0:Lh76;

.field public final j0:Lu77;

.field public final k0:Lf76;

.field public final l0:Lpd0;

.field public final m0:Log7;


# direct methods
.method public constructor <init>(Lv06;Ls98;Ljava/lang/String;Lbm3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lnf0;->X:Ls98;

    .line 11
    .line 12
    iput-object p3, p0, Lnf0;->Y:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {p1}, Lv06;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/hardware/camera2/CameraManager;

    .line 19
    .line 20
    iput-object p1, p0, Lnf0;->Z:Landroid/hardware/camera2/CameraManager;

    .line 21
    .line 22
    new-instance p1, Low7;

    .line 23
    .line 24
    invoke-direct {p1, p4}, Ldm3;-><init>(Lbm3;)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p2, Ls98;->h:Lu61;

    .line 28
    .line 29
    new-instance p3, Lx61;

    .line 30
    .line 31
    const-string p4, "CXCP-CameraStatusMonitor"

    .line 32
    .line 33
    invoke-direct {p3, p4}, Lx61;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2, p3}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p1, p2}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Lgv3;->c(Ls61;)Lm51;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lnf0;->f0:Lm51;

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    invoke-static {p2}, Lnr4;->e(Z)Lpv;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    iput-object p3, p0, Lnf0;->g0:Lpv;

    .line 56
    .line 57
    sget-object p3, Lcl0;->a:Lcl0;

    .line 58
    .line 59
    invoke-static {p3}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iput-object p3, p0, Lnf0;->h0:Loh7;

    .line 64
    .line 65
    invoke-static {p3}, Ljm4;->n(Loh7;)Lh76;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    iput-object p3, p0, Lnf0;->i0:Lh76;

    .line 70
    .line 71
    const/4 p3, 0x7

    .line 72
    const/4 p4, 0x0

    .line 73
    invoke-static {p2, p3, p4}, Lv77;->b(IILl90;)Lu77;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iput-object p2, p0, Lnf0;->j0:Lu77;

    .line 78
    .line 79
    invoke-static {p2}, Ljm4;->m(Lu77;)Lf76;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object p2, p0, Lnf0;->k0:Lf76;

    .line 84
    .line 85
    new-instance p2, Lq0;

    .line 86
    .line 87
    const/16 p3, 0xa

    .line 88
    .line 89
    invoke-direct {p2, p0, p4, p3}, Lq0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p2}, Lw51;->n(Lrn2;)Lpd0;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    iput-object p2, p0, Lnf0;->l0:Lpd0;

    .line 97
    .line 98
    new-instance p2, Lr5;

    .line 99
    .line 100
    const/4 p3, 0x3

    .line 101
    invoke-direct {p2, p0, p4, p3}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p4, p4, p2, p3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Lnf0;->m0:Log7;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnf0;->g0:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnf0;->m0:Log7;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lnf0;->f0:Lm51;

    .line 16
    .line 17
    invoke-static {p0, v1}, Lgv3;->i(Lb71;Ljava/util/concurrent/CancellationException;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
