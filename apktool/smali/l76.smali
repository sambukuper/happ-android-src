.class public final Ll76;
.super Lnv;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lm76;


# direct methods
.method public constructor <init>(Lm76;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll76;->a:Lm76;

    .line 2
    .line 3
    invoke-direct {p0}, Lnv;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final timedOut()V
    .locals 1

    .line 1
    iget-object p0, p0, Ll76;->a:Lm76;

    .line 2
    .line 3
    iget-boolean v0, p0, Lm76;->o0:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lm76;->o0:Z

    .line 10
    .line 11
    iget-object v0, p0, Lm76;->p0:Lwg;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lwg;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lo42;

    .line 18
    .line 19
    invoke-interface {v0}, Lo42;->cancel()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p0, p0, Lm76;->q0:Lp76;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Lp76;->c:Ljava/net/Socket;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-static {p0}, Lks8;->d(Ljava/net/Socket;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method
