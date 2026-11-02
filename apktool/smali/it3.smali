.class public final Lit3;
.super Ldh3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g:Llt3;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llt3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lit3;->g:Llt3;

    .line 5
    .line 6
    invoke-virtual {p1}, Llt3;->g()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lit3;->h:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lit3;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
