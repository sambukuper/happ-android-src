.class public final Lsx0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lds5;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ld0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ld0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsx0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lsx0;->b:Ld0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsx0;->b:Ld0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ld0;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lsx0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
