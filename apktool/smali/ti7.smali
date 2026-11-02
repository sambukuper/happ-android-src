.class public final synthetic Lti7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:I

.field public final synthetic Y:Z

.field public final synthetic Z:I

.field public final synthetic f0:I

.field public final synthetic g0:I

.field public final synthetic h0:I

.field public final synthetic i0:[I


# direct methods
.method public synthetic constructor <init>(IZIIII[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lti7;->X:I

    .line 5
    .line 6
    iput-boolean p2, p0, Lti7;->Y:Z

    .line 7
    .line 8
    iput p3, p0, Lti7;->Z:I

    .line 9
    .line 10
    iput p4, p0, Lti7;->f0:I

    .line 11
    .line 12
    iput p5, p0, Lti7;->g0:I

    .line 13
    .line 14
    iput p6, p0, Lti7;->h0:I

    .line 15
    .line 16
    iput-object p7, p0, Lti7;->i0:[I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v5, p0, Lti7;->h0:I

    .line 2
    .line 3
    iget-object v6, p0, Lti7;->i0:[I

    .line 4
    .line 5
    iget v0, p0, Lti7;->X:I

    .line 6
    .line 7
    iget-boolean v1, p0, Lti7;->Y:Z

    .line 8
    .line 9
    iget v2, p0, Lti7;->Z:I

    .line 10
    .line 11
    iget v3, p0, Lti7;->f0:I

    .line 12
    .line 13
    iget v4, p0, Lti7;->g0:I

    .line 14
    .line 15
    invoke-static/range {v0 .. v6}, Lorg/conscrypt/metrics/StatsLogImpl;->a(IZIIII[I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
