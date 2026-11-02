.class public final synthetic Lsi4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:Lvi4;

.field public final synthetic Y:J

.field public final synthetic Z:J

.field public final synthetic f0:Lgo5;


# direct methods
.method public synthetic constructor <init>(Lvi4;JJLgo5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsi4;->X:Lvi4;

    .line 5
    .line 6
    iput-wide p2, p0, Lsi4;->Y:J

    .line 7
    .line 8
    iput-wide p4, p0, Lsi4;->Z:J

    .line 9
    .line 10
    iput-object p6, p0, Lsi4;->f0:Lgo5;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lsi4;->X:Lvi4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvi4;->y0()Lti4;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    iput-boolean v2, v1, Lti4;->X:Z

    .line 9
    .line 10
    invoke-virtual {v0}, Lvi4;->y0()Lti4;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-wide v2, p0, Lsi4;->Y:J

    .line 15
    .line 16
    iput-wide v2, v1, Lti4;->Y:J

    .line 17
    .line 18
    invoke-virtual {v0}, Lvi4;->y0()Lti4;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-wide v2, p0, Lsi4;->Z:J

    .line 23
    .line 24
    iput-wide v2, v1, Lti4;->Z:J

    .line 25
    .line 26
    iget-object p0, p0, Lsi4;->f0:Lgo5;

    .line 27
    .line 28
    iget-object p0, p0, Lgo5;->X:Lyr4;

    .line 29
    .line 30
    invoke-interface {p0}, Lyr4;->g()Lgn2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lvi4;->y0()Lti4;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 44
    .line 45
    return-object p0
.end method
